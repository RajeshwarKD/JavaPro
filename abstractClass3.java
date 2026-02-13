//1. A method without body (no implementation) is known as abstract method.
//2. A method must always be declared in an abstract class, or we can say that if a class has an abstract method, it should be declared abstract as well.
//3. If a regular class extends an abstract class, then the class must have to implement all the abstract methods of abstract parent class or it has to be declared abstract as well.
//4. Abstract method in an abstract class is meant to be overridden in derived concrete classes otherwise compile time error will be thrown.
//5. Abstract classes cannot be instantiated, means we can’t create an object of abstract class. 


abstract class Parent{
    public Parent(){
        System.out.println("Mai Parent class ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet1();
    abstract public void greet2();
}

class Child1 extends Parent{
    @Override
    public void greet1(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child2 extends Parent{
    public void greet3(){
        System.out.println("I am good");
    }
}

public class abstractClass3 {
    public static void main(String[] args) {
        //Parent p = new Parent(); -- error
        Child1 c1 = new Child1();
        //Child2 c2 = new Child2(); -- error
    }
}

