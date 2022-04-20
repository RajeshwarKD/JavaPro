package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        // Code to create a new file

       /* File myFile = new File("fileHandling.txt");
        try {
            myFile.createNewFile();
            System.out.println("File is created successfully");
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        */

        // Code to write to a file
      /* try {
            FileWriter fileWriter = new FileWriter("fileHandling.txt");
            fileWriter.write("This is our first file from this java subject\nPlease insert all text string");
            fileWriter.close();
            System.out.println("File is writing successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } */

       // Reading a file
       /* try {
            FileReader fileReading = new FileReader("fileHandling.txt");
            Scanner sc = new Scanner(fileReading);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        } */

        // Deleting a file
        File myFile = new File("fileHandling.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
