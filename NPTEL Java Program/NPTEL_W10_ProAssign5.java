package com.company;
// Complete the code segment to rename an already created table named ‘PLAYERS’ into ‘SPORTS’.

/*  Output: No. of columns : 4
            Column 1 Name: UID
            Column 1 Type : INT
            Column 2 Name: First_Name
            Column 2 Type : VARCHAR
            Column 3 Name: Last_Name
            Column 3 Type : VARCHAR
            Column 4 Name: Age
            Column 5 Type : INT     */

import java.sql.*;
import java.lang.*;
import java.util.*;
public class NPTEL_W10_ProAssign5 {
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

            // Open a connection
            //conn = DriverManager.getConnection(DB_URL);
            //stmt = conn.createStatement();

            Statement stmt = conn.createStatement();

            // The statement containing SQL command to create table "players"
            //String CREATE_TABLE_SQL1="CREATE TABLE PLAYERS (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";

            // Execute the statement containing SQL command below this comment
            //stmt.executeUpdate(CREATE_TABLE_SQL1);

            // Write the SQL command to rename a table
            String alter="ALTER TABLE PLAYERS RENAME TO SPORTS;";

            // Execute the SQL command
            stmt.executeUpdate(alter);

            ResultSet res = stmt.executeQuery("SELECT * FROM SPORTS;");
            ResultSetMetaData rsmd = res.getMetaData();
            System.out.println("No. of columns : " + rsmd.getColumnCount());
            System.out.println("Column 1 Name: " + rsmd.getColumnName(1));
            System.out.println("Column 1 Type : " + rsmd.getColumnTypeName(1));
            System.out.println("Column 2 Name: " + rsmd.getColumnName(2));
            System.out.println("Column 2 Type : " + rsmd.getColumnTypeName(2));
            System.out.println("Column 3 Name: " + rsmd.getColumnName(3));
            System.out.println("Column 3 Type : " + rsmd.getColumnTypeName(3));
            System.out.println("Column 4 Name: " + rsmd.getColumnName(4));
            System.out.println("Column 5 Type : " + rsmd.getColumnTypeName(4));
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
