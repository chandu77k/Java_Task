package dbConnection;

import java.sql.*;

public class DataBaseConnection {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:postgresql://localhost:5433/postgres"; // PostgreSQL database URL
        String user = "postgres"; // Database username
        String password = "Chandu@123"; // Database password

        // SQL query to insert a new record into the questk2 table
        String sql = "INSERT INTO questk2 (empid, empname, designation, salary) VALUES (?, ?, ?, ?)";

        // Using try-with-resources to ensure proper resource management
        try (Connection conn = DriverManager.getConnection(url, user, password); // Establish connection
             PreparedStatement pstmt = conn.prepareStatement(sql)) { // Prepare SQL statement

            // Set values for the placeholders in the SQL query
            pstmt.setInt(1, 106);
            pstmt.setString(2, "Panda");
            pstmt.setString(3, "Internship");
            pstmt.setInt(4, 2000);

            // Execute the insert query
            int rowInserted = pstmt.executeUpdate();
            
            // Check if the insertion was successful
            if (rowInserted > 0) {
                System.out.println("Inserted Row Successfully!");
            }
        } catch (SQLException e) {
            // Print the SQL exception if an error occurs
            e.printStackTrace();
        }
    }
}
