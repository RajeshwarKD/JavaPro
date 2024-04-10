import java.io.FileInputStream;
public class FileInputStreamExample2 {
    public static void main(String[] args){
        try{
            FileInputStream file = new FileInputStream("D:\\TextFile.txt");
            int i=0;
            while((i=file.read())!=-1){
                System.out.print((char)i); //read all characters
            }
            file.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}