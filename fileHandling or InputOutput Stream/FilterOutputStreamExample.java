
import java.io.*;
public class FilterOutputStreamExample {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\TextFile1.txt");
        FileOutputStream fileOP = new FileOutputStream(file);
        FilterOutputStream filterOP = new FilterOutputStream(fileOP);
        String s = "Welcome to Java IO Programming.";
        byte b[] = s.getBytes();
        filterOP.write(b);
        filterOP.flush();
        filterOP.close();
        fileOP.close();
        System.out.println("file create and write successfully...");
    }
}
