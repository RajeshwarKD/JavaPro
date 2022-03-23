package com.company;

public class arithmeticExceptionHandler {
    public void exceptionMassages (){
        try{

            int num1=30, num2=0;
            int output=num1/num2;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e){
            System.out.println ("You Shouldn't divide a number by zero");
        }
    }
}
