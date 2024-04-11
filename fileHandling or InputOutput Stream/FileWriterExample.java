import java.io.*;
public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("D:\\TextFile.txt");
            file.write("I love my country");
            file.close();
            System.out.println("file create and write successfully...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
