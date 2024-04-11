import java.io.*;
public class WriterExample {
    public static void main(String[] args) {
        try {
            Writer file = new FileWriter("D:\\TextFile.txt");
            String content = "I love my country";
            file.write(content);
            file.close();
            System.out.println("file create and write successfully...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
