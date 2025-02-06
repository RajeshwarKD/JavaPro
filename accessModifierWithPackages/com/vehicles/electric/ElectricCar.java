// File: com/vehicles/electric/ElectricCar.java
package com.vehicles.electric;

import com.vehicles.Car;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, String color, int batteryCapacity) {
        super(brand, model, year, color);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayBatteryCapacity() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void displayInfo() {
        displayPublic(); // Accessible
        displayProtected(); // Accessible
        // displayDefault(); // Not accessible
        // displayPrivate(); // Not accessible
        // displayAll();
        displayBatteryCapacity();
    }
}
