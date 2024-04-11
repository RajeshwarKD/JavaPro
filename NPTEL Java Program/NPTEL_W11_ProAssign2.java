package com.company;
// Write the required code in order to update the following data in the table ‘PLAYERS’.

/*      Column      UID         First_Name          Last_Name           Age
        Type        Integer     Varchar (45)        Varchar (45)        Integer
        From        1           Ram                 Gopal               26
        To          1           Rama                Gopala              24          */

import java.sql.*;
import java.lang.*;
public class NPTEL_W11_ProAssign2 {
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

            String query_insert = " insert into PLAYERS (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(query_insert);
            preparedStmt.setInt (1, 1);
            preparedStmt.setString (2, "Ram");
            preparedStmt.setString (3, "Gopal");
            preparedStmt.setInt(4, 26);

            preparedStmt.execute();

            preparedStmt.setInt (1, 2);
            preparedStmt.setString (2, "John");
            preparedStmt.setString   (3, "Mayer");
            preparedStmt.setInt(4, 22);

            preparedStmt.execute();

            // write SQL command to update table data
            String query_update = " UPDATE Players SET First_name ='Rama',Last_name = 'Gopala',Age = 24  WHERE UID=1;";

            // Execute the SQL command to update the table data
            stmt.executeUpdate(query_update);
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
