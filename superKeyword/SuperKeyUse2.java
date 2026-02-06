//2. “super” keyword can be used to invoke immediate parent class method.

// Parent Class
class Employee22 {
    int employeeID = 100; // Parent's ID
    void show() {
        // Parent version of the method
        System.out.println("Parent Method: Displaying Employee Data...");
    }
}

// Child Class
class Manager22 extends Employee22 {
    int employeeID = 500; // Child's ID (shadows the parent)

    void display() {
        // Using 'super' to invoke the PARENT class method
        super.show();

        // Using 'this' to access the CURRENT class instance variable
        System.out.println("Child Class (Manager) ID: " + this.employeeID);

        // Using 'super' to refer to the PARENT class instance variable
        System.out.println("Parent Class (Employee) ID: " + super.employeeID);
    }

    public static void main(String[] args) {
        Manager22 obj = new Manager22(); // Creating the object of the Child class
        obj.display(); // Calling the display method to see super in action
    }
}
