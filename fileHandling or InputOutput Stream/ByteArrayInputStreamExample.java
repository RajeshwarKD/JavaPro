//simple example of java ByteArrayInputStream class to read byte array as input stream.
import java.io.*;
public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {
        byte[] byteArray = { 65, 66, 67, 68 };
        // Create the new byte array input stream
        ByteArrayInputStream byteFile = new ByteArrayInputStream(byteArray);
        int k = 0;
        while ((k = byteFile.read()) != -1) {
            //Conversion of a byte into character
            char ch = (char) k;
            System.out.println("ASCII value of character is:" + k + "; Alphabet character is: " + ch);
        }
    }
}
