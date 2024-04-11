package com.company;
// Complete the code segment to drop the table named ‘PLAYERS’.

import java.sql.*;
import java.lang.*;
public class NPTEL_W11_ProAssign5 {
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
            //String query="";

            // Open a connection
            //conn = DriverManager.getConnection(DB_URL);
            //stmt = conn.createStatement();

            Statement stmt = conn.createStatement();

            // The statement containing SQL command to create table "players"
            String CREATE_TABLE_SQL="CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
            // Execute the statement containing SQL command
            stmt.executeUpdate(CREATE_TABLE_SQL);

            ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("No. of columns : " + rsmd.getColumnCount());

            // Write the SQL command to drop a table
            String query = "DROP TABLE players;";
            // Execute the SQL command to drop a table
            stmt.executeUpdate(query);

            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
