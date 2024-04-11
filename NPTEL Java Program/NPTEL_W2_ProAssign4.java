package com.company;
//Complete the code segment to call default constructor first and then any other constructor in the class.
//Output
//        You got nothing.
//        You got 10 for an MCQ

// This is the main class Question
public class NPTEL_W2_ProAssign4 {
    public static void main(String[] args) {
        Answer a = new Answer(10,"MCQ");
    }
}
class Answer{
    Answer(){
        System.out.println("You got nothing.");
    }
    Answer(int marks, String type){
        this();
        System.out.println("You got "+marks+" for an "+ type);
    }
}
