import java.io.*;
public class BufferedOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream file =new FileOutputStream("D:\\TextFile.txt");
        BufferedOutputStream bufferFile =new BufferedOutputStream(file);
        String s = "Welcome to Buffered Output Stream Class";
        byte b[]=s.getBytes();
        bufferFile.write(b);
        bufferFile.flush();
        bufferFile.close();
        file.close();
        System.out.println("file create and write successfully...");

    }
}
