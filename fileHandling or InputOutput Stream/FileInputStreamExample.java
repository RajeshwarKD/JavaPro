import java.io.FileInputStream;
public class FileInputStreamExample {
    public static void main(String[] args){
        try{
            FileInputStream file = new FileInputStream("D:\\TextFile.txt");
            int i = file.read(); //read single character
            System.out.print((char)i);
            file.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}