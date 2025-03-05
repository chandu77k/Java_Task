package jdbcTransaction;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.*;

public class C3P0Db {
    private static ComboPooledDataSource dataSource;

    static {
        try {
            dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass("org.postgresql.Driver");  // Load PostgreSQL JDBC driver
            dataSource.setJdbcUrl("jdbc:postgresql://localhost:5433/postgres"); // Database URL
            dataSource.setUser("postgres"); // Database username
            dataSource.setPassword("Chandu@123"); // Database password
            
            // Connection pool settings
            dataSource.setMinPoolSize(2);  // Minimum number of connections in the pool
            dataSource.setMaxPoolSize(5);  // Maximum number of connections in the pool
            dataSource.setAcquireIncrement(1); // Number of connections acquired at a time when pool is exhausted
            dataSource.setMaxStatements(50); // Maximum number of cached SQL statements
            dataSource.setMaxIdleTime(60); // Time in seconds before an idle connection is closed
        } catch (Exception e) {
            e.printStackTrace(); // Print error if initialization fails
        }
    }

    // Method to get a connection from the pool
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    // Method to insert data into the questk2 table
    public static void insertData(Integer empid, String empname, String designation, Integer salary) {
        String sql = "INSERT INTO questk2(empid, empname, designation, salary) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, empid);
            stmt.setString(2, empname);
            stmt.setString(3, designation);
            stmt.setInt(4, salary);
            stmt.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace(); // Print error if insertion fails
        }
    }

    // Method to fetch and print data from the questk2 table
    public static void fetchData() {
        String sql = "SELECT * FROM questk2";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("empID: " + rs.getInt("empid") +
                        ", empName: " + rs.getString("empname") +
                        ", Designation: " + rs.getString("designation") +
                        ", Salary: " + rs.getInt("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Print error if fetching data fails
        }
    }

    // Method to print connection pool statistics
    public static void printConnectionStats() {
        try {
            System.out.println("Connections in Use: " + dataSource.getNumBusyConnectionsAllUsers()); // Active connections
            System.out.println("Idle Connections: " + dataSource.getNumIdleConnectionsAllUsers()); // Available connections
            System.out.println("-------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error retrieving connection stats.");
        }
    }

    // Method to close the connection pool
    public static void closeDataSource() {
        dataSource.close();
        System.out.println("Connection pool closed.");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Before getting connections:");
            printConnectionStats();

            // Acquire two database connections from the pool
            Connection conn1 = getConnection();
            Connection conn2 = getConnection();
            System.out.println(conn1.hashCode()); // Print connection hash to verify connection reuse
            System.out.println(conn2.hashCode());

            System.out.println("After acquiring 2 connections:");
            printConnectionStats();

            // Close the acquired connections (return to pool)
            conn1.close();
            conn2.close();

            System.out.println("After releasing 2 connections:");
            printConnectionStats();

            // Insert sample employee data
            insertData(108, "Nirmal", "Admin", 9872);
            insertData(109, "Sai", "HR", 1234);
            
            // Fetch and display data
            fetchData();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exceptions
        } finally {
            closeDataSource(); // Ensure the connection pool is closed at the end
        }
    }
}
