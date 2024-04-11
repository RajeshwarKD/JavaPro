package com.company;
/*Write the JDBC codes needed to create a Connection interface using the DriverManager class and
the variable DB_URL.  Check whether the connection is successful using 'isAlive(timeout)' method to
generate the output, which is either 'true' or 'false'.

        Note the following points carefully:
        1. Name the connection object as 'conn' only.
        2. Use timeout value as 1.*/

//Input Case        default - 0
//                  1
//Output Case       true
//                  false

import java.sql.*;
import java.lang.*;
import java.util.*;
public class NPTEL_W10_ProAssign2 {
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

            // Open a connection and check connection status
            //conn = DriverManager.getConnection(DB_URL);

            System.out.println(conn.isValid(1));

            // Private test case
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            if(s==1){
                conn.close();
                System.out.print(conn.isValid(1));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
