package com.company;

import javax.lang.model.element.NestingKind;

public class wrapperClassExample {
    public static void main(String[] args) {

        int n = 10;
        Integer in = new Integer(n); // boxing or wrapping
        System.out.println(in);

        int i = in.intValue();
        System.out.println(i); // unboxing

        Integer inte = n; // autoboxing
        System.out.println(inte);

        int j = inte;
        System.out.println(j); // autounboxing

        String str = "133";
        int num = Integer.parseInt(str); // parseInt() is static method in wrapper class so-called time used name of wrapper class
        System.out.println(num); // convert string to integer value to help of wrapper class

        //converts into wrapper objects
      /* Integer obj = Integer.valueOf(n); // valueOf() is static method in wrapper class so-called time used name of wrapper class

       if (obj instanceof Integer) { //instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
            System.out.println("An object of Integer is created.");

        } */
    }
}
