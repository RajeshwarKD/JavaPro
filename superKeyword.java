package com.company;

class firstClass{
    int a;
    public int getA(){ // getter method of x
        return a;
    }
    firstClass (int a){ // Constructor with a parameter
        this.a = a;
    }
}
class secondClass extends firstClass{ // extends secondClass with help of firstClass
    secondClass (int b){
        super(b); // super keyword a reference variable used to refer immediate parent class object.
        System.out.println(" I am a constructor");
    }
}
public class superKeyword {
    public static void main(String[] args) {
        firstClass f1 = new firstClass(65);
        secondClass s2 = new secondClass(5);
        System.out.println(f1.getA());
        System.out.println(s2.getA());

    }
}
