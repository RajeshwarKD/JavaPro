package com.company;

/*Create a base class called shape. It contains two methods getxyvalue() and showxyvalue() for
accepting co-ordinates and to display the same. Create the subclass called Rectangle which contains
a method to display the length and breadth of the rectangle called showxyvalue().Use overriding concept.*/
import java.util.*;
//Base class
class shape {
    int x,y;

    void getxyvalue(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        x=sc.nextInt();

        System.out.print("Enter value of y: ");
        y=sc.nextInt();
    }

    void showxyvalue(){

        System.out.println("Co-ordinate x: "+x);
        System.out.println("Co-ordinate y: "+y);
    }
}
//Subclass
class rectangle extends shape{

    int length, breadth;
    //Method overriding
    void getxyvalue(){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of length: ");
        length=sc.nextInt();

        System.out.print("Enter value of breadth: ");
        breadth=sc.nextInt();
    }
    //Method overriding
    void showxyvalue(){

        System.out.println("Length of Rectangle: "+length);
        System.out.println("Breadth of Rectangle: "+breadth);
    }

    public static void main(String args[]){

        shape s = new shape();
        s.getxyvalue();
        s.showxyvalue();

        shape r = new rectangle();
        r.getxyvalue();
        r.showxyvalue();
    }
}