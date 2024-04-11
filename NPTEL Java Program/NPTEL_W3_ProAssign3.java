package com.company;
/*A class Shape is defined with two overloading constructors in it. Another class Test1 is partially defined
which inherits the class Shape. The class Test1 should include two overloading constructors as appropriate for
some object instantiation shown in main( ) method. You should define the constructors using the super class constructors.
Also, override the method calculate( ) in Test1 to calculate the volume of a Shape.*/

//Input     2.0
//          3.0
//          4.0
//Output    16.0
//          24.0

import java.util.Scanner;
class Shape{
    double length, breadth;
    Shape(double l, double b){ //Constructor to initialize a Shape object
        length = l;
        breadth= b;
    }
    Shape(double len){    //Constructor to initialize another Shape object
        length = breadth = len;
    }
    double calculate(){// To calculate the area of a shape object
        return length * breadth ;
    }
}

    public class NPTEL_W3_ProAssign3 extends Shape{
        double height;
        //Create a derived class constructor which can call the one parametrized constructor of the base class
        NPTEL_W3_ProAssign3(double length,double h)  { //base class constructor with one parameter is called
            super(length);
            height=h;
        }
        //Create a derived class constructor which can call the two parametrized constructor of the base class
        NPTEL_W3_ProAssign3(double length,double breadth,double h) {   //base class constructor having two argument is called
            super(length,breadth);
            height=h;
        }
        //Override the method calculate() in the derived class to find the volume of a shape instead of finding the area of a shape
        double calculate() {   // calculate the volume of the shape
            return length * breadth * height;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Create an object to read input
        double l=sc.nextDouble(); //Read length
        double b=sc.nextDouble(); //Read breadth
        double h=sc.nextDouble(); //Read height
        NPTEL_W3_ProAssign3 myshape1 = new NPTEL_W3_ProAssign3(l,h);
        NPTEL_W3_ProAssign3 myshape2 = new NPTEL_W3_ProAssign3(l,b,h);
        double volume1;
        double volume2;
        volume1 = myshape1.calculate();
        volume2=myshape2.calculate();
        System.out.println(volume1);
        System.out.println(volume2);

    }
}
