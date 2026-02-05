//2. Invoke Current Class Method (Implicitly)
//Used to call one method from another within the same class.

class Employee2 {
    int employeeID;
    int age;
    int salary;
    // Constructor with 2 parameters
    Employee2(int employeeID, int age) {
        this.employeeID = employeeID;
        this.age = age;
    }
    // Method invoking another method in the same class
    // Constructor with 3 parameters (Demonstrates Constructor Chaining)
    Employee2(int employeeID, int age, int salary) {
        this(employeeID, age); // Use #2: Invoking current class method implicitly
        this.salary = salary;
    }
    // Method to print data
    void show() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        // Test with 3 parameters
        Employee2 obj2 = new Employee2(1,20,3000);
        obj2.show();
        // Test with 2 parameters
        Employee2 obj3 = new Employee2(1,20);
        obj3.show();
    }
}
