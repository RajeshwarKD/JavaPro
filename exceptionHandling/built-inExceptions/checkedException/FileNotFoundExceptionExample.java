package checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to open a file that does not exist
            File file = new File("nonexistentfile.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
