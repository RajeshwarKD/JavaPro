//1. Refer to Current Class Instance Variable
//Used to distinguish between class fields and parameters with the same name.

class Employee1 {
    int employeeID;
    int age;

    Employee1(int employeeID, int age) {
        this.employeeID = employeeID;
        this.age = age;
    }

    void show() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Employee1 obj1 = new Employee1(1,20);
        obj1.show();
    }
}
