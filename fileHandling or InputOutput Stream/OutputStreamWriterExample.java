
import java.io.*;
public class OutputStreamWriterExample {
    public static void main(String[] args) {
        try {
            OutputStream file = new FileOutputStream("D:\\TextFile.txt");
            Writer fileWrite = new OutputStreamWriter(file);
            fileWrite.write("I love my country");
            fileWrite.close();
            System.out.println("file create and write successfully...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
