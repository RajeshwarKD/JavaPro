/* JDBC program for Student Mark Insert and Display Processing
   Follows the standard JDBC 7 steps:
   1. Import or Create the database
   2. Load and register drivers
   3. Create the connection
   4. Create a statement/query
   5. Execute the statement/query
   6. Process the results
   7. Close the connection
*/

import java.sql.*;
import java.util.Scanner;

public class ProgramNo17 {
    public static void main(String[] args) {
        try {
            // Step 2: Load and register the JDBC driver
            // This loads the MySQL JDBC driver class into memory
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection parameters
            String user = "root";          // MySQL username
            String password = "password";   // MySQL password
            String url = "jdbc:mysql://localhost:3306/students_marks";  // JDBC URL

            // Step 3: Create the connection using try-with-resources for automatic closing
            try (Connection con = DriverManager.getConnection(url, user, password);
                 // Scanner for user input, also auto-closed
                 Scanner scanner = new Scanner(System.in)) {

                // Verify the database connection
                if (con.isClosed()) {
                    System.out.println("Database connection is closed");
                    return;  // Exit if connection failed
                }
                System.out.println("Database connection created successfully...");

                // Main program loop for menu-driven interface
                while (true) {
                    // Display menu options
                    System.out.println("\nPRESS 1 to ADD student name and marks");
                    System.out.println("PRESS 2 to SHOW student name and marks");
                    System.out.println("PRESS 0 for EXIT program");
                    System.out.print("Enter your choice: ");

                    // Get user choice
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the leftover newline character

                    if (choice == 1) {
                        // Option 1: Add new student record
                        System.out.print("Enter the student name: ");
                        String sname = scanner.nextLine();

                        // Get marks for each subject
                        System.out.print("Enter the C++ obtained marks: ");
                        int cpp = scanner.nextInt();

                        System.out.print("Enter the JAVA obtained marks: ");
                        int java = scanner.nextInt();

                        System.out.print("Enter the PYTHON obtained marks: ");
                        int python = scanner.nextInt();

                        System.out.print("Enter the MySQL obtained marks: ");
                        int mysql = scanner.nextInt();
                        scanner.nextLine(); // Consume the leftover newline character

                        // Step 4: Create a prepared statement for insertion
                        String query = "INSERT INTO students_marks(sname, cpp, java, python, mysql) VALUES(?,?,?,?,?)";

                        // Step 5: Execute the statement
                        try (PreparedStatement pstmt = con.prepareStatement(query)) {
                            // Set parameter values
                            pstmt.setString(1, sname);
                            pstmt.setInt(2, cpp);
                            pstmt.setInt(3, java);
                            pstmt.setInt(4, python);
                            pstmt.setInt(5, mysql);

                            // Execute the update
                            pstmt.executeUpdate();
                            System.out.println("Data inserted successfully....");
                        }

                    } else if (choice == 2) {
                        // Option 2: Display all student records

                        // Step 4: Create a statement
                        String query = "SELECT * FROM students_marks";

                        // Steps 5 & 6: Execute query and process results
                        try (Statement stmt = con.createStatement();
                             ResultSet set = stmt.executeQuery(query)) {

                            System.out.println("\nStudent Records:");
                            System.out.println("=======================================");

                            // Process each row in the result set
                            while (set.next()) {
                                // Retrieve values by column index
                                int sid = set.getInt(1);        // Student ID
                                String sname = set.getString(2); // Student Name
                                int cpp = set.getInt(3);       // C++ Marks
                                int java = set.getInt(4);      // Java Marks
                                int python = set.getInt(5);     // Python Marks
                                int mysql = set.getInt(6);      // MySQL Marks

                                // Display the record
                                System.out.println("Student ID: " + sid);
                                System.out.println("Student Name: " + sname);
                                System.out.println("C++ Marks: " + cpp);
                                System.out.println("JAVA Marks: " + java);
                                System.out.println("PYTHON Marks: " + python);
                                System.out.println("MySQL Marks: " + mysql);
                                System.out.println("=======================================");
                            }
                        }

                    } else if (choice == 0) {
                        // Option 0: Exit the program
                        System.out.println("Exiting program...");

                        // Step 7: Close the database connection
                        con.close();
                        break;  // Exit the loop

                    } else {
                        // Invalid choice handler
                        System.out.println("Invalid choice! Please try again.");
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            // Handle driver not found exception
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            // Handle database connection errors
            System.err.println("Database connection error!");
            e.printStackTrace();
        } catch (Exception e) {
            // Handle all other exceptions
            System.err.println("An error occurred!");
            e.printStackTrace();
        }
    }
}