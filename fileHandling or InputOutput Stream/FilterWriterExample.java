import java.io.*;
class CustomFilterWriter extends FilterWriter {
    CustomFilterWriter(Writer out) {
        super(out);
    }
}

public class FilterWriterExample {
    public static void main(String[] args) {
        try {
            // Create a FileWriter to write to a file named "Record.txt"
            FileWriter file1 = new FileWriter("D:\\TextFile.txt");
            // Create a custom FilterWriter that modifies the text to lowercase
            CustomFilterWriter fileWrite = new CustomFilterWriter(file1);

            // Write the text to the file
            fileWrite.write("I LOVE MY COUNTRY");
            // Close the filter writer
            fileWrite.close();

            // Read the content from the file and print it
            FileReader file2 = new FileReader("D:\\TextFile.txt");
            BufferedReader bufferFile = new BufferedReader(file2);
            int k;
            while ((k = bufferFile.read()) != -1) {
                System.out.print((char) k);
            }
            bufferFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
