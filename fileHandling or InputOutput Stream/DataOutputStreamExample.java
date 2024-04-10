//In this example, we are writing the data to a text file TextFile1.txt using DataOutputStream class.
import java.io.*;
public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException{
        FileOutputStream file = new FileOutputStream("D:\\TextFile1.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(66);
        data.flush();
        data.close();
        System.out.println("file create and write successfully...");
    }
}
