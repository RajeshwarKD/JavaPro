// In this example, we are reading the data from the file TextFile1.txt file.
import java.io.*;
public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("D:\\TextFile1.txt");
        DataInputStream data = new DataInputStream(file);
        int count = file.available();
        byte[] byteArray = new byte[count];
        data.read(byteArray);
        for (byte bt : byteArray) {
            char k = (char) bt;
            System.out.print(k+"-");
        }
    }
}
