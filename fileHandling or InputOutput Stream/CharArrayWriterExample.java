// this example, we are writing a common data to 2 files TextFile1.txt and TextFile2.txt.
import java.io.*;
public class CharArrayWriterExample {
    public static void main(String[] args) throws IOException {
        CharArrayWriter file=new CharArrayWriter();
        file.write("Welcome to Char Array Writer Class");
        FileWriter textFile1 =new FileWriter("D:\\TextFile1.txt");
        FileWriter textFile2 =new FileWriter("D:\\TextFile2.txt");
        file.writeTo(textFile1);
        file.writeTo(textFile2);
        textFile1.close();
        textFile2.close();
        System.out.println("file create and write successfully...");
    }
}
