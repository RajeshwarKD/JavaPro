import java.io.*;

class CustomFilterReader extends FilterReader {
    CustomFilterReader(Reader in) {
        super(in);
    }
}

public class FilterReaderExample {
    public static void main(String[] args) {
        try {
            // Create a FileReader to read from a file named "javaFile123.txt"
            FileReader file = new FileReader("D:\\TextFile.txt");
            // Create a custom FilterReader that modifies whitespace to question marks
            CustomFilterReader fileWrite = new CustomFilterReader(file);

            int i;
            while ((i = fileWrite.read()) != -1) {
                System.out.print((char) i);
            }
            // Close the filter reader and the underlying reader
            fileWrite.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
