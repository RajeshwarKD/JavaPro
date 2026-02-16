class Outer{
    public  void show(){
        System.out.println("i'm outer class method");
    }
    static class Inner{
        public void show(){
            // Can access private members of Outer class
            System.out.println("i'm inner class method");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.show();
        Outer.Inner obj2 = new Outer.Inner(); // if declare inner class as a static class
//        Outer.Inner obj2 = obj1.new Inner();
        obj2.show();
    }
}
