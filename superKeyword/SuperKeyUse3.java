//3. “super()” can be used to invoke immediate parent class constructor.

// Parent Class
class Employee33 {
    Employee33() {
        // Parent Default Constructor
        System.out.println("Parent Class Constructor: Starting Employee Data...");
    }
}

// Child Class
class Manager33 extends Employee33 {
    int employeeID = 500; // Child's ID (shadows the parent)
    int salary = 2000;
    Manager33() {
        // Child Constructor
        // Using 'super()' to invoke the immediate PARENT class constructor
        super();
        // Using 'this' to access the CURRENT class instance variable
        System.out.println("Child Class Constructor: (Manager) ID: " + this.employeeID);
        System.out.println("Child Class Constructor: (Manager) Salary: " + this.salary);
    }


    public static void main(String[] args) {
        Manager33 obj = new Manager33(); // Creating the object of the Child class triggers the constructor chain
    }
}
