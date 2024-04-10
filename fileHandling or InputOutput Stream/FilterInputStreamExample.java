import java.io.*;
public class FilterInputStreamExample {
    public static void main(String[] args) throws IOException{
        File file = new File("D:\\TextFile1.txt");
        FileInputStream fileIP = new FileInputStream(file);
        FilterInputStream filterIP = new BufferedInputStream(fileIP);
        int k =0;
        while((k= filterIP.read())!=-1){
            System.out.print((char)k);
        }
        fileIP.close();
        filterIP.close();
    }
}
