package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/** This class is responsible for the connecting the IntelliJ IDE to the MySQL database. */
public abstract class JDBC {
    private static final String protocol = "jdbc";
    private static final String vendor = ":mysql:";
    private static final String location = "//localhost/";
    private static final String databaseName = "client_schedule";
    private static final String jdbcUrl = protocol + vendor + location + databaseName + "?connectionTimeZone = SERVER"; //LOCAL
    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Driver reference
    private static final String userName = "sqlUser"; // Username
    private static final String password = "Passw0rd!";
    public static Connection connection; // Connection Interface

    /** This method opens the database connection. */
    public static void openConnection() {
        try {
            Class.forName(driver); // Locate Driver
            connection = DriverManager.getConnection(jdbcUrl, userName, password); // Reference connection object
            System.out.println("Connection successful!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /** This method returns the database connection object.
     *  @return the connection object
     */
    public static Connection getConnection() {
        return connection;
    }

    /** This method closes the database connection. */
    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection closed!");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
