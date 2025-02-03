
class OuterClass {
    int y = 20;

    static class NestedClass {  // Static Nested Class
        void show() {
            System.out.println("Inside Static Nested Class...");
        }
    }

    class InnerClass { // Inner Class (Non-Static Nested Class)
        void display() {
            System.out.println("Inside Non-Static Nested/Inner Class & y = " + y); // Accessing non-static member of OuterClass
        }
    }
}
public class staticNestedClass {
    public static void main(String[] args) {
        OuterClass.NestedClass Obj = new OuterClass.NestedClass();
        Obj.show();

        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();
    }
}

