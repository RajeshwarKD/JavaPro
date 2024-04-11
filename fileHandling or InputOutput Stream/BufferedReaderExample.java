import java.io.*;
public class BufferedReaderExample {
    public static void main(String[] args) throws IOException{
        FileReader file = new FileReader("D:\\TextFile.txt");
        BufferedReader bufferFile =new BufferedReader(file);
        int i;
        while((i= bufferFile.read())!=-1){
            System.out.print((char)i);
        }
        bufferFile.close();
        file.close();
    }
}
