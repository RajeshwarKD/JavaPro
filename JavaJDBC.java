import java.sql.*;
import java.util.Scanner;

public class JavaJDBC {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/students_marks";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {
        Connection con = null;
        try {
            // Step 1: Load and register driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create the connection
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            // Check connection
            if (con.isClosed()) {
                System.out.println("Database connection is closed");
                return;
            }
            System.out.println("Database connection created successfully...");

            // Create table if not exists
            createTable(con);

            // User menu
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\n1. Add Student Marks");
                System.out.println("2. Display All Students");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addStudentMarks(con, sc);
                        break;
                    case 2:
                        displayAllStudents(con);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        con.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Step 7: Close connection (in finally block)
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }

    private static void createTable(Connection con) throws SQLException {
        // Step 4: Create statement
        Statement stmt = con.createStatement();

        // Step 5: Execute query
        String sql = "CREATE TABLE IF NOT EXISTS student_marks (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(100) NOT NULL, " +
                "roll_no VARCHAR(20) NOT NULL, " +
                "marks INT NOT NULL)";
        stmt.executeUpdate(sql);
        System.out.println("Table created/verified successfully");
        stmt.close();
    }

    private static void addStudentMarks(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter student name: ");
        String name = sc.next();
        System.out.print("Enter roll number: ");
        String rollNo = sc.next();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        // Step 4: Create prepared statement
        String sql = "INSERT INTO student_marks (name, roll_no, marks) VALUES (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, rollNo);
        pstmt.setInt(3, marks);

        // Step 5: Execute update
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " record(s) inserted");
        pstmt.close();
    }

    private static void displayAllStudents(Connection con) throws SQLException {
        // Step 4: Create statement
        Statement stmt = con.createStatement();

        // Step 5: Execute query
        ResultSet rs = stmt.executeQuery("SELECT * FROM student_marks");

        // Step 6: Process results
        System.out.println("\nStudent Marks:");
        System.out.println("ID\tName\tRoll No\tMarks");
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + "\t" +
                            rs.getString("name") + "\t" +
                            rs.getString("roll_no") + "\t" +
                            rs.getInt("marks")
            );
        }
        rs.close();
        stmt.close();
    }
}