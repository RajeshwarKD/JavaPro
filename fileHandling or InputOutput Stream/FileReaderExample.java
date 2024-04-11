import java.io.*;
public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("D:\\TextFile.txt");
            int i;
            while((i=file.read())!=-1)
                System.out.print((char)i);
            file.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
