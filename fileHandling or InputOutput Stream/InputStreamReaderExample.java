import java.io.*;
public class InputStreamReaderExample {
    public static void main(String[] args) {
        try {
            InputStream file = new FileInputStream("D:\\TextFile.txt");
            Reader fileRead = new InputStreamReader(file);
            int data = fileRead.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileRead.read();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
