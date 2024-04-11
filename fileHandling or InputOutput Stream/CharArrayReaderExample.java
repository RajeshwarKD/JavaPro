//the simple example to read a character using Java CharArrayReader class.
import java.io.*;
public class CharArrayReaderExample {
    public static void main(String[] args) throws IOException {
        char[] ary = { 'j', 'a', 'v', 'a', 'p', 'r', 'o', 'g', 'r', 'a', 'm' };
        CharArrayReader file = new CharArrayReader(ary);
        int k = 0;
        // Read until the end of a file
        while ((k = file.read()) != -1) {
            char ch = (char) k;
            System.out.print(ch + " : ");
            System.out.println(k);
        }
    }
}
