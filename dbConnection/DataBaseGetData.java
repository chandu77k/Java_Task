package dbConnection;

import java.sql.*;

public class DataBaseGetData {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:postgresql://localhost:5433/postgres"; // PostgreSQL URL
        String user = "postgres"; // Database username
        String password = "Chandu@123"; // Database password

        // SQL query to fetch all records from questk2 table
        String sql = "SELECT * FROM questk2";

        // Declare connection, prepared statement, and result set variables
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish connection to the database
            conn = DriverManager.getConnection(url, user, password);
            
            // Prepare SQL statement
            pstmt = conn.prepareStatement(sql);
            
            // Execute the query and store the result
            rs = pstmt.executeQuery();

            // Iterate through the result set and display each row
            while (rs.next()) {
                int id = rs.getInt("empid"); // Get employee ID
                String name = rs.getString("empname"); // Get employee name
                String designation = rs.getString("designation"); // Get designation
                double salary = rs.getDouble("salary"); // Get salary

                // Print the retrieved row
                System.out.println("empId: " + id + ", empName: " + name + 
                                   ", designation: " + designation + ", Salary: " + salary);
            }
        } catch (SQLException e) {
            // Handle any SQL exceptions
            System.out.println(e.getMessage());
        } finally {
            // Close ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            // Close PreparedStatement
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Close Connection
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
