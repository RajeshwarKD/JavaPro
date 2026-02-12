import java.util.Scanner;
import java.io.*;

public class ProgramNo14 {
    public static void main(String[] args) {
        // Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String fileName = keyboard.nextLine();

        int vCount = 0, cCount = 0;

        // Use try-with-resources to ensure fileReader and fileScanner close automatically
        try {
            FileReader fileReading = new FileReader(fileName);
            Scanner fileScanner = new Scanner(fileReading);

            System.out.println("Reading from file: " + fileName);

            while (fileScanner.hasNextLine()) {
                // Reading a line from the FILE (not the keyboard)
                String sentence = fileScanner.nextLine();
                System.out.println("The sentence is: " + sentence);

                // Convert to lowercase
                sentence = sentence.toLowerCase();

                for (int i = 0; i < sentence.length(); i++) {
                    char ch = sentence.charAt(i);

                    // Vowel check
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vCount++;
                    }
                    // Consonant check (a-z and not a vowel)
                    else if (ch >= 'a' && ch <= 'z') {
                        cCount++;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.err.println("Error: An issue occurred while reading the file.");
        } finally {
            keyboard.close(); // Close the keyboard scanner
        }

        System.out.println("\n--- Final Counts ---");
        System.out.println("Number of vowels in the given sentence is: " + vCount);
        System.out.println("Number of consonants in the given sentence is: " + cCount);
    }
}