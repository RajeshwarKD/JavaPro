//3. Invoke Current Class Constructor: this()
//Used for Constructor Chaining to reuse code from other constructors.

class Employee3 {
    int employeeID;
    int age;

    Employee3() {
        System.out.println("Welcome to Employee3");
    }

    Employee3(int employeeID, int age) {
        this(); // Calls the default constructor (Step 1)
        this.employeeID = employeeID;
        this.age = age;
    }

    void show() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Employee3 obj3 = new Employee3(1,20);
        obj3.show();
    }
}
