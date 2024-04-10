//Example that reads the data from two files and writes into another file
//we are writing the data of two files TextFile1.txt and TextFile2.txt into another file named TextOut.txt.
import java.io.*;
public class SequenceInputStreamExample2 {
    public static void main(String[] args) throws Exception{
        FileInputStream file1 =new FileInputStream("D:\\TextFile1.txt"); //Welcome to Java IO Programming.
        FileInputStream file2 =new FileInputStream("D:\\TextFile2.txt"); //It is the example of Java SequenceInputStream class.
        FileOutputStream fileOut=new FileOutputStream("D:\\TextOut.txt");
        SequenceInputStream seqFile =new SequenceInputStream(file1, file2);
        int i;
        while((i= seqFile.read())!=-1)
        {
            fileOut.write(i);
        }
        seqFile.close();
        fileOut.close();
        file1.close();
        file2.close();
        System.out.println("file create and write successfully...");
    }
}
