import java.io.*;
public class ConsoleReadStringExample {
    public static void main(String[] args) throws IOException{
        Console c = System.console();
        System.out.println("Enter your name: ");
        String str = c.readLine();
        System.out.println("Welcome " + str);
    }
}
