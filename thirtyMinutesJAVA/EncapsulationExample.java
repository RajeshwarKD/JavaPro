package thirtyMinutesJAVA;

// Person class demonstrating encapsulation
class Person {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age with validation
    public void setAge(int age) {
        if (age > 0) { // Validation to ensure age is positive
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be greater than 0.");
        }
    }
}

// Main class to test encapsulation
public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person();

        // Setting values using setter methods
        person.setName("John Doe");
        person.setAge(25);

        // Getting values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Trying to set an invalid age
        person.setAge(-5); // This will trigger the validation message
        System.out.println("Age after invalid update: " + person.getAge()); // Age remains unchanged
    }
}