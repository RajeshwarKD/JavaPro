// com/
// ├── vehicles/
// │   ├── Car.java
// │   ├── Main.java
// │   └── electric/
// │       └── ElectricCar.java

// File: com/vehicles/Main.java
package com.vehicles;

import com.vehicles.electric.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Maruti Suzuki", "Swift Dzire ZXi", 2024, "White"); // same package
        car.displayAll();
        // car.displayPublic(); // Accessible
        // car.displayProtected(); // Accessible
        // car.displayDefault(); // Accessible
        // car.displayPrivate(); // Not accessible

        ElectricCar electricCar = new ElectricCar("TATA", "Nexon EV", 2025, "Red", 100); // different subpackage
        electricCar.displayInfo();
    }
}

