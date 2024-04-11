import java.io.*;
public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("D:\\TextFile.txt");
        BufferedWriter bufferFile = new BufferedWriter(file);
        bufferFile.write("Welcome to Buffered Writer Class");
        bufferFile.flush();
        bufferFile.close();
        System.out.println("file create and write successfully...");
    }
}
