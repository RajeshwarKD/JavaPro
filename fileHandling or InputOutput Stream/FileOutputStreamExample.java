import java.io.FileOutputStream;
public class FileOutputStreamExample {
    public static void main(String[] args){
        try{
            FileOutputStream file = new FileOutputStream("D:\\TextFile.txt");
            file.write(65);
            file.close();
            System.out.println("file create and write successfully...");
        }catch(Exception e){
            System.err.println(e);
        }
    }
}  