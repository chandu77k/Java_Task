package jdbcTransaction;

import java.sql.*;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Hikari {
    public static HikariDataSource dataSource;

    static {
        // Configure HikariCP Connection Pool
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5433/postgres");
        config.setUsername("postgres");
        config.setPassword("Chandu@123");
        config.setMaximumPoolSize(5); // Maximum connections in the pool
        config.setMinimumIdle(2); // Minimum idle connections
        config.setIdleTimeout(40000); // Timeout for idle connections
        config.setConnectionTimeout(40000); // Timeout for getting a connection

        // Initialize HikariDataSource with the configuration
        dataSource = new HikariDataSource(config);
    }

    // Method to get a database connection from the pool
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    // Print connection pool statistics
    public static void printConnectionStats() {
        System.out.println("Total Connections : " + dataSource.getHikariPoolMXBean().getTotalConnections());
        System.out.println("Active Connections (Used): " + dataSource.getHikariPoolMXBean().getActiveConnections());
        System.out.println("Idle Connections (Available): " + dataSource.getHikariPoolMXBean().getIdleConnections());
        System.out.println("Pending Threads Waiting: " + dataSource.getHikariPoolMXBean().getThreadsAwaitingConnection());
        System.out.println("-------------------------------------------------");
    }

    public static void main(String[] args) {
        try {
            // Print stats before acquiring connections
            System.out.println("Before getting connections:");
            printConnectionStats();

            // Acquire multiple connections from the pool
            Connection conn1 = getConnection();
            Connection conn2 = getConnection();
            Connection conn3 = getConnection();
            Connection conn4 = getConnection();
            Connection conn5 = getConnection();
            // Connection conn6 = getConnection(); // Uncomment to exceed max pool size
            
            System.out.println("After acquiring 2 connections:");
            printConnectionStats();

            // Release one connection back to the pool
            conn1.close();
            // conn2.close();
            // conn3.close();
            // conn4.close();

            System.out.println("After releasing 2 connections:");
            printConnectionStats();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection pool when the program ends
            System.out.println("close");
            dataSource.close();
        }
    }
}
