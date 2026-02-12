import java.io.*;
import java.util.Scanner;

public class ProgramNo14a {
    public static void main(String[] args) {
        // Scanner for keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String fileName = sc.nextLine();

        int vowels = 0, consonants = 0;

        // Use try-with-resources to ensure fileReader and fileScanner close automatically
        try {
            FileReader fr = new FileReader(fileName);
            int i;

        // Read character by character
        while ((i = fr.read()) != -1) {
            char ch = Character.toLowerCase((char) i);

            // If it is a letter between a and z
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.err.println("Error: An issue occurred while reading the file.");
        } finally {
            sc.close(); // Close the keyboard scanner
        }

        System.out.println("\n--- Final Counts ---");
        System.out.println("Number of vowels in the given sentence is: " + vowels);
        System.out.println("Number of consonants in the given sentence is: " + consonants);

    }
}