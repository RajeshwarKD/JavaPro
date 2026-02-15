package com.company;

public class copyConstructor {
    private double realNo, imaginaryNo;

    // A normal parametrized constructor
    public copyConstructor(double realNo, double imaginaryNo) {
        this.realNo = realNo;
        this.imaginaryNo = imaginaryNo;
    }

    // copy constructor
    public copyConstructor(copyConstructor copy) {
        System.out.println("Copy constructor called");
        realNo = copy.realNo;
        imaginaryNo = copy.imaginaryNo;
    }

    public static void main(String[] args) {
        copyConstructor constructor = new copyConstructor(10, 15.34);
        System.out.println(constructor.realNo+ " + " +constructor.imaginaryNo + "i");

        // Following involves a copy constructor call
        copyConstructor copy = new copyConstructor(constructor);

        // Note that following doesn't involve a copy constructor call as
        // non-primitive variables are just references.
        System.out.println(copy.realNo+ " + " +copy.imaginaryNo + "i");
    }
}


