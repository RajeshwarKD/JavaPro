class VariableDemo {
    // 1. Instance Variable (Declared inside class but outside methods)
    // Every object of this class gets its own copy of this variable.
    String instanceVar = "I am an Instance Variable";

    // 2. Static Variable (Declared with the 'static' keyword)
    // There is only one copy of this variable, shared by all objects.
    static String staticVar = "I am a Static (Class) Variable";

    void showLocalVariable() {
        // 3. Local Variable (Declared inside a method or block)
        // It can only be used inside this specific method.
        String localVar = "I am a Local Variable";

        System.out.println("Local: " + localVar);
    }

    public static void main(String[] args) {
        // Create an object to access instance variables
        VariableDemo obj = new VariableDemo();

        // Accessing Static Variable (No object needed, but can use one)
        System.out.println("Static: " + VariableDemo.staticVar);

        // Accessing Instance Variable (Must use an object)
        System.out.println("Instance: " + obj.instanceVar);

        // Accessing Local Variable (By calling the method)
        obj.showLocalVariable();

        // Note: You cannot access 'localVar' here. It would cause an error.
    }
}