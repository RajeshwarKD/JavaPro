package com.company;

// Example 1: Primitive Types to Wrapper Objects
public class wrapperClass {
    public static void main(String[] args) {

        // create primitive types
        int a = 5;
        double b = 5.65;

        //converts into wrapper objects
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        if(aObj instanceof Integer) { //instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
            System.out.println("An object of Integer is created.");
        }

        if(bObj instanceof Double) {
            System.out.println("An object of Double is created.");
        }
    }
}
