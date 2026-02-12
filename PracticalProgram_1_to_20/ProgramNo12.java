import java.io.*;

public class ProgramNo12 {
    public static void main(String[] args) {
        // Custom text to be written down in above file
        // Step 1: Storing text into String datatype
        String data = "Welcome to SSPU-BHILAI. This file was created using Byte Streams.";

        // Try block to check if any exception/s occur
        try  {
            // Step 2: Creating object of the file and passing local directory path of file as input
            FileOutputStream myFile  = new FileOutputStream("myFile.txt");

            // Step 3: Convert the String into a byte array
            byte[] byteArray = data.getBytes();

            // Step 4: Write the byte array to the file
            myFile.write(byteArray);

            // Step 5: Close the file using close() method
            myFile.close();

            System.out.println("Success: The text file 'myFile.txt' has been created.");
        // Catch block to handle exceptions
        } catch (IOException e) {
            // Display and print the exception
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}