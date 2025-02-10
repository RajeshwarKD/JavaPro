package checkedException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Trying to open and read a file that does not exist
            reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            String line = reader.readLine();
            System.out.println("Line: " + line);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            // Closing the reader in the finally block to ensure it gets closed
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error while closing the reader: " + e);
                }
            }
        }
    }
}

