import java.io.*;
public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("D:\\TextFile.txt");
            BufferedInputStream bufferFile = new BufferedInputStream(file);
            int i;
            while((i=bufferFile.read())!=-1){
                System.out.print((char)i); //read all characters
            }
            bufferFile.close();
            file.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
