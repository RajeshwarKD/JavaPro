class Student1 {
    String name;
    int rollNo;

    // 1. Default Constructor
    // It has no parameters and provides default values to the object.
    Student1() {
        System.out.println("--- Default Constructor Called ---");
        this.name = "Unknown";
        this.rollNo = 0;
    }

    // 2. Parameterized Constructor
    // Used to initialize the object with specific values.
    Student1(String n, int r) {
        System.out.println("--- Parameterized Constructor Called ---");
        this.name = n;
        this.rollNo = r;
    }

    // 3. Copy Constructor
    // It creates a new object using the values of an existing object.
    Student1(Student1 other) {
        System.out.println("--- Copy Constructor Called ---");
        this.name = other.name;
        this.rollNo = other.rollNo;
    }

    void display() {
        System.out.println("Student: " + name + " | Roll No: " + rollNo);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Using Default Constructor
        Student1 s1 = new Student1();
        s1.display();

        System.out.println();

        // Using Parameterized Constructor
        Student1 s2 = new Student1("Amit", 101);
        s2.display();

        System.out.println();

        // Using Copy Constructor (Copying s2 into s3)
        Student1 s3 = new Student1(s2);
        s3.display();
    }
}