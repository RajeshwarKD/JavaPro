package com.company;

import java.io.*;

public class fileCreate2ByteStream {
    public static void main(String args[])
    {

        // Try block to check if any exception/s occur
        try {

            // Step 1: Creating object of the file and
            // passing local directory path of file as input
            FileOutputStream myFile  = new FileOutputStream("myFile.txt");

            // Custom text to be written down in above file
            // Step 2: Storing text into String datatype
            String s = "Welcome to Program No. 12. This is an example of Java program to write file using ByteStream.";
            System.out.println("File is created with writing successfully to help of ByteStream class");

            // Step 3: Converting string into byte array
            byte b[] = s.getBytes();

            // Step 4: Write byte data to file output
            myFile.write(b);

            // Step 5: Close the file using close() method
            myFile.close();
        }

        // Catch block to handle exceptions
        catch (IOException e) {

            // Display and print the exception
            System.out.println(e);
        }
    }
}
