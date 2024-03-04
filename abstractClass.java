abstract class Shape{
    abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing circle");
    }
}
//In real scenario, method is called by programmer or user

public class abstractClass {
    public static void main(String[] args) {
        Shape s1=new Circle();//In a real scenario, object is provided through method, e.g., getShape() method
        s1.draw();
        Shape s2 = new Rectangle();
        s2.draw();
    }
}
