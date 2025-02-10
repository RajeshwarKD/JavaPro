package checkedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionExample {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Attempting to connect to a non-existent database
            String url = "jdbc:mysql://localhost:3306/nonexistentdb";
            String username = "root";
            String password = "password";

            // Establishing the connection
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();

            // Executing a query on the non-existent database
            String query = "SELECT * FROM non_existent_table";
            statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            // Closing the statement and connection
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Error while closing the statement: " + e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error while closing the connection: " + e);
                }
            }
        }
    }
}

