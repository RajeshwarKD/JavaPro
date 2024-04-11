package com.company;
/*Due to some mistakes in the below code, the code is not compiled/executable.
 Modify and debug the JDBC code to make it execute successfully.*/

//Output Case       true

import java.sql.*;  // All sql classes are imported
import java.lang.*; // Semicolon is added
import java.util.*;
public class NPTEL_W10_ProAssign3 {
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

            // Connection object is created
            //conn = DriverManager.getConnection(DB_URL);

            conn.close();
            System.out.print(conn.isClosed());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
