
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDriverExample1 {
    public static void main(String[] args){
        // Database URL
        String url = "jdbc:mysql://localhost:3306/students";

        // Database credentials
        String user = "root";
        String password = "password";

        // Establish the connection
        Connection con = null;
        try {
            // Step 1: Load and register driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create the connection
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");

        } catch (ClassNotFoundException e) {
            System.err.println("SQL Driver not found");
        } catch (SQLException e) {
            System.err.println("SQL Connection failed: " + e.getMessage());
        }
    }
}
