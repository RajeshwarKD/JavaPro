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

public class abstractClass2 {
    public static void main(String[] args) {
        //Parent p = new Parent(); -- error
        Child1 c1 = new Child1();
        //Child2 c2 = new Child2(); -- error
    }
}
