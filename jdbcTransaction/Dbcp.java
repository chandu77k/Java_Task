package jdbcTransaction;

import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;
import java.time.Duration;

public class Dbcp {
    private static BasicDataSource dataSource;

    static {
        // Configure Apache DBCP Connection Pool
        dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5433/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("Chandu@123");
        dataSource.setMinIdle(2); // Minimum idle connections
        dataSource.setMaxIdle(5); // Maximum idle connections
        dataSource.setMaxTotal(5); // Maximum total connections
        dataSource.setMaxWait(Duration.ofMinutes(1)); // Maximum wait time for a connection
    }

    // Get a database connection from the pool
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    // Insert data into the database
    public static void insertData(Integer empid, String empname, String designation, Integer salary) {
        String sql = "insert into questk2(empid, empname, designation, salary) values(?,?,?,?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, empid);
            stmt.setString(2, empname);
            stmt.setString(3, designation);
            stmt.setInt(4, salary);
            stmt.executeUpdate(); // Execute the insert query
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Fetch and print data from the database
    public static void fetchData() {
        String sql = "SELECT * FROM questk2";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                // Printing the retrieved data
                System.out.println("empID: " + rs.getInt("empid") +
                        ", empName: " + rs.getString("empname") +
                        ", Designation: " + rs.getString("designation") +               
                        ", Salary: " + rs.getInt("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Monitor connection pool statistics
    public static void printConnectionStats() {
        System.out.println("Active Connections (Used): " + dataSource.getNumActive());
        System.out.println("Idle Connections (Available): " + dataSource.getNumIdle());
        System.out.println("-------------------------------------------------");
    }

    // Close the connection pool (use this when shutting down the application)
    public static void closeDataSource() {
        try {
            dataSource.close();
            System.out.println("Connection pool closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Main method to test connection pooling
    public static void main(String[] args) {
        try {
            System.out.println("Before getting connections:");
            printConnectionStats();

            // Acquiring two connections from the pool
            Connection conn1 = getConnection();
            Connection conn2 = getConnection();
            System.out.println(conn1.hashCode());  
            System.out.println(conn2.hashCode());  

            System.out.println("After acquiring 2 connections:");
            printConnectionStats();

            // Releasing the acquired connections back to the pool
            conn1.close();
            conn2.close();

            System.out.println("After releasing 2 connections:");
            printConnectionStats();

            // Insert and fetch data from the database
            insertData(108, "Nirmal", "Admin", 9872);
            insertData(109, "Sai", "HR", 1234);
            fetchData();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection pool when the program ends
            closeDataSource();
        }
    }
}
