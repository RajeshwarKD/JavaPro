package com.company;

public class wrapperClassExample {
    public static void main(String[] args) {

        int n = 10;
        Integer in = new Integer(n); // boxing or wrapping
        System.out.println(in);

        int i = in.intValue();
        System.out.println(i); // unboxing

        Integer inte = n; // autoboxing
        System.out.println(n);

        int j = inte;
        System.out.println(j); // autounboxing

        //converts into wrapper objects
      /* Integer obj = Integer.valueOf(n);

       if (obj instanceof Integer) { //instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
            System.out.println("An object of Integer is created.");

        } */
    }
}
