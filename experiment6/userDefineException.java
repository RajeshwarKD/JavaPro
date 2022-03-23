package com.company;
import java.util.*;

class myException extends Exception {

    myException(String s)
    {
        super(s);
    }
}

class userDefineException {

    public static void main(String argv[])throws myException    {

        System.out.print("Enter marks: ");
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();

        if( marks > 100 )
        {
            throw new myException ("Input marks greater than 100 ");
        }

        else
            System.out.println("Marks: "+marks);
    }
}