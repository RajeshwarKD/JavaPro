package com.company;
// Complete the code segment to insert the following data using prepared statement in the existing table ‘PLAYERS’.

/*      Column      UID         First_Name          Last_Name           Age
        Type        Integer     Varchar (45)        Varchar (45)        Integer
        Row 1       1           Ram                 Gopal               26
        Row 2       2           John                Mayer               22          */

import java.sql.*;
import java.lang.*;
public class NPTEL_W11_ProAssign1 {
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
            String CREATE_TABLE_SQL="CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
            // Execute the statement containing SQL command
            stmt.executeUpdate(CREATE_TABLE_SQL);
            // Write code here…
            String query = " insert into PLAYERS (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt (1, 1);
            preparedStmt.setString (2, "Ram");
            preparedStmt.setString (3, "Gopal");
            preparedStmt.setInt(4, 26);

            preparedStmt.execute();

            preparedStmt.setInt (1, 2);
            preparedStmt.setString (2, "John");
            preparedStmt.setString (3, "Mayer");
            preparedStmt.setInt(4, 22);

            preparedStmt.execute();

            //Evaluation Portion

            ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
            conn.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
