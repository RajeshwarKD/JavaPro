import java.io.*;
public class ReaderExample {
    public static void main(String[] args) {
        try {
            Reader file = new FileReader("D:\\TextFile.txt");
            int data = file.read();
            while (data != -1) {
                System.out.print((char) data);
                data = file.read();
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
