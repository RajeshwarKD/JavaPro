//6. Return Current Class Instance from Method
//Used for Method Chaining (calling multiple methods in one line).

class Employee6 {
    Employee6 start() {
        System.out.println("Process Started.");
        return this; // Returns the current object instance
    }
    void finish() {
        System.out.println("Process Finished.");
    }
    public static void main(String[] args) {
        Employee6 obj6 = new Employee6();
        obj6.start().finish(); // Method chaining
//        obj6.start();
//        obj6.finish();
    }
}
