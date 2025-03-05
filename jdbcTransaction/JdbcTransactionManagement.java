package jdbcTransaction;

import java.sql.*;

public class JdbcTransactionManagement {

    public static void setData(Integer empid, String empname, String designation, Integer salary) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt3 = null;
        try {
            // Database connection details
            String url = "jdbc:postgresql://localhost:5433/postgres";
            String user = "postgres";
            String password = "Chandu@123";

            // Establish connection
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false); // Start transaction

            // Insert operation
            String sql1 = "insert into questk2(empid, empname, designation, salary) values(?,?,?,?)";
            pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setInt(1, empid);
            pstmt1.setString(2, empname);
            pstmt1.setString(3, designation);
            pstmt1.setInt(4, salary);
            pstmt1.executeUpdate();

            // Delete operation
            String sql3 = "delete from questk2 where empid=108";
            pstmt3 = conn.prepareStatement(sql3);
            pstmt3.executeUpdate();

            // Commit transaction
            conn.commit();
            System.out.println("Operations performed successfully...");

        } catch (Exception exception) {
            try {
                // Rollback in case of an error
                if (conn != null) {
                    conn.rollback();
                    System.out.println("rolled back...");
                }
            } catch (SQLException sqlexception) {
                sqlexception.printStackTrace();
            }
            exception.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pstmt1 != null) pstmt1.close();
                if (pstmt3 != null) pstmt3.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Calling the method to insert and delete data with transaction management
        setData(107, "Aditya", "Dev", 2999);
    }
}
