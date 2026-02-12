import java.io.*;
import java.util.Scanner;

public class ProgramNo13 {

    // Method to handle the copying logic
    public static void copyContent(File source, File dest) {
        // Try-with-resources: Automatically closes 'in' and 'out' even if an error occurs
        try {
             FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(dest);

            int n;
            System.out.println("Copying in progress...");

            // read() function to read the byte of data until End of File (-1)
            while ((n = in.read()) != -1) {
                // write() function to write the byte of data
                out.write(n);
            }
            System.out.println("Success: File copied from " + source.getName() + " to " + dest.getName());

        } catch (FileNotFoundException e) {
            System.err.println("Error: The source file was not found.");
        } catch (IOException e) {
            System.err.println("Error: An I/O error occurred during the copy process.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get Source File
        System.out.print("Enter the source filename (to read from): ");
        String sourcePath = sc.nextLine();
        File sourceFile = new File(sourcePath);

        // 2. Get Destination File
        System.out.print("Enter the destination filename (to write to): ");
        String destPath = sc.nextLine();
        File destFile = new File(destPath);

        // 3. Perform Copy
        if (sourceFile.exists()) {
            copyContent(sourceFile, destFile);
        } else {
            System.err.println("Execution Failed: Source file does not exist!");
        }
        sc.close();
    }
}