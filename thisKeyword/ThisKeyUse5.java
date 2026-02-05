//5. Pass this as an Argument in a Constructor Call
//Used when one class needs to pass its instance to another class's constructor.

 class Employee5 {
    Employee5() {
        EmpDetails5 emp = new EmpDetails5(this); // Passing Parent object to Child constructor
    }
     void show() {
         System.out.println("Welcome to Employee5");
     }
     public static void main(String[] args) {
        Employee5 Obj4 = new Employee5();
     }
}
class EmpDetails5 {
    EmpDetails5(Employee5 obj) {
        obj.show(); // Using the Parent object passed via 'this'
    }
}

// sequenceDiagram
// participant M as Main Method
// participant E as Employee5 Object (this)
// participant D as EmpDetails5 Object
//
// M->>E: 1. new Employee5() (Constructor Call)
// activate E
// Note over E: Constructor starts execution
// E->>D: 2. new EmpDetails5(this)
// activate D
// Note right of D: Receives Employee5 instance via 'obj'
// D->>E: 3. obj.show() (Callback using the reference)
// E-->>D: 4. Prints "Welcome to Employee5"
// deactivate D
// Note over E: Constructor finished
// deactivate E
// M->>M: 5. Obj4 reference is stored