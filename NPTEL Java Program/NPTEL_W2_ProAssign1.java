package com.company;

// Complete the code segment to call the method  print() of class Student first and then call print() method of class School.
//NOTE: Don't provide any INPUT in Sample Test Cases
// This is the class named School
class School {
    // This is a method in class School
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
}
// This is the class named Student
class Student {
    // This is a method in class Student
    public void print() {
        System.out.println("Hi! I am class STUDENT");
    }
}

public class NPTEL_W2_ProAssign1 {
    public static void main(String[] args) {

        // Create an object of class Student
        Student s1=new Student();
        // Call 'print()' method of class Student
        s1.print();

        // Create an object of class School
        School s2=new School();
        // Call 'print()' method of class School
        s2.print();

    }
}

