package com.company;
// Write the appropriate code in order to delete the following data in the table ‘PLAYERS’.

/*      Column      UID         First_Name          Last_Name           Age
        Type        Integer     Varchar (45)        Varchar (45)        Integer
        Delete      1           Rama                Gopala              24          */

//  Output:         2           John                Mayer               22

import java.sql.*;
import java.lang.*;
public class NPTEL_W11_ProAssign3 {
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
            // Execute the command in order to delete a row from the table
            stmt.executeUpdate("DELETE FROM Players WHERE UID = 1;");
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
