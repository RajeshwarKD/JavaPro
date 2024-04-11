// The File class have several methods for working with directories and files such as creating new directories or files,
// deleting and renaming directories or files, listing the contents of a directory etc.
import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\TextFile.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
