import java.io.FileOutputStream;
public class FileOutputStreamExample2 {
    public static void main(String[] args){
        try{
            FileOutputStream file = new FileOutputStream("D:\\TextFile.txt");
            String s = "Welcome to File Output Stream Class";
            byte b[] = s.getBytes();//converting string into byte array
            file.write(b);
            file.close();
            System.out.println("file create and write successfully...");
        }catch(Exception e){
            System.err.println(e);
        }
    }
} 