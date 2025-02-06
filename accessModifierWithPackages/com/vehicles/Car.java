// File: com/vehicles/Car.java
package com.vehicles;

public class Car {
    public String brand;
    protected String model;
    int year;
    private String color;
   

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayPublic() {
        System.out.println("Public method: Brand - " + brand);
    }

    protected void displayProtected() {
        System.out.println("Protected method: Model - " + model);
    }

    void displayDefault() {
        System.out.println("Default method: Year - " + year);
    }

    private void displayPrivate() {
        System.out.println("Private method: Color - " + color);
    }

    public void displayAll() {
        displayPublic();
        displayProtected();
        displayDefault();
        displayPrivate();
    }
}
