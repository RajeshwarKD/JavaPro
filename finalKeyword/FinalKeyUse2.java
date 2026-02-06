//2. Final Method :	Prevents Method Overriding.

class Parent22 {
//    final void normalMethod() { //Final Key Prevents Method Overriding.
    void normalMethod() {
        System.out.println("This method can be overridden.");
    }
}

class Child22 extends Parent22 {

    @Override
    void normalMethod() {
        System.out.println("Overridden method in Child class.");
    }

    public static void main(String[] args) {
        Child22 obj = new Child22();
        obj.normalMethod();
    }
}

