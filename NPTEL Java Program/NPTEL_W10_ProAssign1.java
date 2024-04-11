package com.company;
/*The following code needs some package to work properly. Write appropriate code to
import the required package(s) in order to make the program compile and execute successfully.*/

// Import required packages
import java.sql.*;
import java.lang.*;
public class NPTEL_W10_ProAssign1 {
    public static void main(String[] args) {
        try {
            // Load or register driver (mysql-connector-java-8.0.28.jar) file on this project
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create the connection
            String USER = "root";
            String PASSWORD = "password";
            String DB_URL = "jdbc:mysql://localhost:3306/students_marks";
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // Check the database connection
            if (conn.isClosed()) {
                System.out.println("Database connection is closed");
            } else {
                System.out.println("Database connection created successfully...");
            }
            //Connection conn = null;
            //Statement stmt = null;
            //String DB_URL = "jdbc:sqlite:/tempfs/db";
            //System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // JDBC Codes in the hidden section
            // Open a connection
            //conn = DriverManager.getConnection(DB_URL);

            System.out.println(conn.isValid(1));
            conn.close();

            // JDBC Codes in the visible section
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
