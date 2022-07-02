package com.company;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Deepak");
        System.out.println("String Length :" + s1.length());
        System.out.println("String Capacity :" + s1.capacity()); // default capacity 16 + string length
        System.out.println(s1.append(" Verma"));
        System.out.println(s1.charAt(2));

        StringBuffer s2 = new StringBuffer("Deepak");
        System.out.println(s2.delete(3, 6));

        StringBuffer s3 = new StringBuffer("Deepak");
        System.out.println(s3.reverse());

        StringBuffer s4 = new StringBuffer("Deepak");
        System.out.println(s4.insert(0, "Mr "));
        System.out.println(s4.deleteCharAt(1));

        StringBuffer s5 = new StringBuffer("deepak");  // match to return value 0
        System.out.println(s1.compareTo(s5));
    }
}
