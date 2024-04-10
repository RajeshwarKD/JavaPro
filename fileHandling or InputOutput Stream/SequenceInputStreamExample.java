//In this example, we are printing the data of two files TextFile1.txt and TextFile2.txt
import java.io.*;
public class SequenceInputStreamExample {
    public static void main(String[] args) throws Exception{
        FileInputStream file1 = new FileInputStream("D:\\TextFile1.txt"); //Welcome to Java IO Programming.
        FileInputStream file2 = new FileInputStream("D:\\TextFile2.txt"); //It is the example of Java SequenceInputStream class.
        SequenceInputStream seqFile = new SequenceInputStream(file1, file2);
        int j;
        while((j= seqFile.read())!=-1){ //read all characters
            System.out.print((char)j);
        }
        seqFile.close();
        file1.close();
        file2.close();
    }
}
