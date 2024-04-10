//simple example of java ByteArrayOutputStream class to write common data into TextFile1.txt file
import java.io.*;
public class ByteArrayOutputStreamExample {
    public static void main(String[] args) throws IOException{
        FileOutputStream file = new FileOutputStream("D:\\TextFile1.txt");
        ByteArrayOutputStream byteFile = new ByteArrayOutputStream();
        byteFile.write(65);
        byteFile.writeTo(file);
        byteFile.flush();
        byteFile.close();//has no effect
        file.close();
        System.out.println("file create and write successfully...");
    }
}
