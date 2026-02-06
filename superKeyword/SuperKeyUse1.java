//1. “super” keyword can be used to refer immediate parent class instance variable.

// Parent Class
class Employee11 {
    int employeeID = 100; // Parent's ID
}

// Child Class
class Manager11 extends Employee11 {
    int employeeID = 500; // Child's ID (shadows the parent)

    void display() {
        // Accessing the current class (Child) variable
        System.out.println("Current Class (Manager) ID: " + this.employeeID);

        // Using 'super' to refer to immediate parent class instance variable
        System.out.println("Parent Class (Employee) ID: " + super.employeeID);
    }

    public static void main(String[] args) {
        Manager11 obj = new Manager11();
        obj.display();
    }
}