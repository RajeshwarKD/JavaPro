package com.company;

// Example 2: Wrapper Objects into Primitive Types
public class wrapperClass2 {
    public static void main(String[] args) {

        // creates objects of wrapper class
        Integer aObj = Integer.valueOf(23); // valueOf() useful static method of wrapper class. its provide return object reference of relative wrapper class
        Double bObj = Double.valueOf(5.55);

        // converts into primitive types
        int a = aObj.intValue();
        double b = bObj.doubleValue();

        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
    }
}
