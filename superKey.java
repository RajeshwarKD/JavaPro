// super keyword in java example

// Base class vehicle
class Vehicle {
    int maxSpeed = 120;
}

// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed = 180;

    void display() {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}

// Driver Program
public class superKey {
    public static void main(String[] args) {
        Car small = new Car();
        small.display();
    }
}