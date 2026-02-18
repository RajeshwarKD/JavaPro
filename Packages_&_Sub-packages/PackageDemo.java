// Importing classes from package and sub-package
import university.Student;
import university.department.Faculty;

public class PackageDemo {
    public static void main(String[] args) {
        // Using class from main package
        Student s = new Student();
        s.msg();

        // Using class from sub-package
        Faculty f = new Faculty();
        f.display();
    }
}