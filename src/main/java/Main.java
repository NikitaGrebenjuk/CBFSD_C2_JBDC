import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.sql.*;
import java.util.Properties;

    public class Main {
        // JDBC driver name and database URL
        public static void main(String[] args) {
            String url = "";
            String username = "";
            String password = "";
            String driver = "";
            Properties config = new Properties();
            try {
                // Load the configuration file
                config.load(new FileInputStream("config.properties"));
                url = config.getProperty("database.url");
                username = config.getProperty("database.username");
                password = config.getProperty("database.password");
                driver = config.getProperty("database.driver");
            } catch (IOException e) {
                // Handle errors reading the configuration file
                e.printStackTrace();
            }
            
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the batch name: ");
            String batchName = scanner.nextLine();

            System.out.print("Enter the participant's name: ");
            String name = scanner.nextLine();

            Connection conn = null;
            Statement stmt = null;
            try {
                // Register JDBC driver
                Class.forName(driver);

                // Open a connection
                conn = DriverManager.getConnection(url, username, password);

                // Execute a query
                stmt = conn.createStatement();
                String sqlCreateBatch;
                sqlCreateBatch = "INSERT INTO Batch (batchName) VALUES ('" +batchName +"')";
                stmt.executeUpdate(sqlCreateBatch);

                String sql_create_participant;
                sql_create_participant = "INSERT INTO Participants (Name,BatchName, BatchID) VALUES ('" + name + "','" + batchName + "', 1)";
                stmt.executeUpdate(sql_create_participant);

                // Clean-up environment
                stmt.close();
                conn.close();
            } catch (SQLException se) {
                // Handle errors for JDBC
                se.printStackTrace();
            } catch (Exception e) {
                // Handle errors for Class.forName
                e.printStackTrace();
            } finally {
                // finally block used to close resources
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                } catch (SQLException se2) {
                    // nothing we can do
                }
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }
