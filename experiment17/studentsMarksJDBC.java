
/*In order to deal with JDBC standard 7 steps are supposed to be followed:

    1. Import or Create the database
    2. Load and register drivers
    3. Create the connection
    4. Create a statement/query
    5. Execute the statement/query
    6. Process the results
    7. Close the connection*/

// JDBC program for Student Mark Insert and Display Processing.

import java.sql.*;
import java.util.Scanner;

public class studentsMarksJDBC {
    public static void main(String[] args) throws Exception {

        // Load and register driver (mysql-connector-java-8.0.28.jar) file on this project
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create the connection
        String user = "root";
        String password = "password";
        String url = "jdbc:mysql://localhost:3306/students_marks";
        Connection con = DriverManager.getConnection(url, user, password);

        // Check the database connection
        if (con.isClosed()) {
            System.out.println("Database connection is closed");
        } else {
            System.out.println("Database connection created successfully...");
        }

        while (true) {
            Scanner intVal = new Scanner(System.in); // for integer value
            Scanner strVal = new Scanner(System.in); // for string value

            System.out.println("PRESS 1 to ADD student name and marks");
            System.out.println("PRESS 2 to SHOW student name and marks");
            System.out.println("PRESS 0 for EXIT program");
            int choice = intVal.nextInt();

            if (choice == 1) {
                // ADD student name and marks
                System.out.println("Enter the student name :");
                String sname = strVal.nextLine();

                System.out.println("Enter the C++ obtained marks :");
                int cpp = intVal.nextInt();

                System.out.println("Enter the JAVA obtained marks :");
                int java = intVal.nextInt();

                System.out.println("Enter the PYTHON obtained marks :");
                int python = intVal.nextInt();

                System.out.println("Enter the MySQL obtained marks :");
                int mysql = intVal.nextInt();

                // Create a statement/query
                String query = "INSERT INTO students_marks(sname, cpp, java, python, mysql) VALUES(?,?,?,?,?)";
                // PreparedStatement
                PreparedStatement pstmt = con.prepareStatement(query);
                // Set the value of parameter
                pstmt.setString(1, sname);
                pstmt.setInt(2, cpp);
                pstmt.setInt(3, java);
                pstmt.setInt(4, python);
                pstmt.setInt(5, mysql);

                // Execute the statement/query
                pstmt.executeUpdate();
                System.out.println("Data inserted successfully....");

                // Close the database connection
                con.close();
                break; // Exit the loop

            } else if (choice == 2) {
                // SHOW student name and marks

                String query = "SELECT * FROM students_marks;";
                // CreateStatement
                Statement pstmt = con.createStatement();
                // Set the value in ResultSet
                ResultSet set = pstmt.executeQuery(query);

                // Process the results
                while (set.next()) {
                    int sid = set.getInt(1);
                    String sname = set.getString(2);
                    int cpp = set.getInt(3);
                    int java = set.getInt(4);
                    int python = set.getInt(5);
                    int mysql = set.getInt(6);


                    System.out.println("Student ID :" + sid);
                    System.out.println("Student Name :" + sname);
                    System.out.println("C++ Marks :" + cpp);
                    System.out.println("JAVA Marks :" + java);
                    System.out.println("PYTHON Marks :" + python);
                    System.out.println("MySQL Marks :" + mysql);
                    System.out.println("=======================================");
                }

                // Close the database connection
                con.close();
                break; // Exit the loop

            } else if (choice == 0) {
                // EXIT program
                break;
            }

        }

    }
}
