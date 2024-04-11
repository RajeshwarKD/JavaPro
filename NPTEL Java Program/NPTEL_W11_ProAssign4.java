package com.company;
// Complete the following program to calculate the average age of the players in the table ‘PLAYERS’.

/*      Column      UID         First_Name          Last_Name           Age
        Type        Integer     Varchar (45)        Varchar (45)        Integer      */

import java.sql.*;
import java.lang.*;
public class NPTEL_W11_ProAssign4 {
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

            String CREATE_TABLE_SQL="CREATE TABLE players ( UID INT, first_name VARCHAR(45), last_name VARCHAR(45), age INT);";
            stmt.executeUpdate(CREATE_TABLE_SQL);

            String query = " insert into Players (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);

            preparedStmt.setInt (1, 1);
            preparedStmt.setString (2, "Rama");
            preparedStmt.setString (3, "Gopala");
            preparedStmt.setInt(4, 24);

            preparedStmt.execute();

            preparedStmt.setInt (1, 2);
            preparedStmt.setString (2, "John");
            preparedStmt.setString   (3, "Mayer");
            preparedStmt.setInt(4, 22);

            preparedStmt.execute();

            preparedStmt.setInt (1, 3);
            preparedStmt.setString (2, "Leo");
            preparedStmt.setString   (3, "Martin");
            preparedStmt.setInt(4, 27);

            preparedStmt.execute();

            // Get the age of the players
            ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
            int count=0,total=0;
            // Write program to calculate the average age
            while(rs.next()){
                count++;
                total = total + Integer.parseInt(rs.getString(4));
            }
            // Print “Average age of players is XX” ; where XX is the INTEGER value of age.
            System.out.println("Average age of players is " +(total/count));
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
