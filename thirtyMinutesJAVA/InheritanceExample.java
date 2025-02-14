package thirtyMinutesJAVA;

// Superclass
class Vehicle {
    // Fields
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    // Method to start the vehicle
    public void start() {
        System.out.println("The vehicle is starting...");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Additional field specific to Car
    private int numberOfDoors;

    // Constructor
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call to superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to superclass method
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    // Additional method specific to Car
    public void honk() {
        System.out.println("Car is honking!");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    // Additional field specific to Bike
    private boolean hasBasket;

    // Constructor
    public Bike(String brand, int year, boolean hasBasket) {
        super(brand, year); // Call to superclass constructor
        this.hasBasket = hasBasket;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to superclass method
        System.out.println("Has Basket: " + hasBasket);
    }

    // Additional method specific to Bike
    public void ringBell() {
        System.out.println("Bike is ringing the bell!");
    }
}

// Main class to test inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating objects of Car and Bike
        Car myCar = new Car("Toyota", 2020, 4);
        Bike myBike = new Bike("Hero", 2019, true);

        // Calling methods
        System.out.println("Car Details:");
        myCar.displayDetails(); // Calls overridden method in Car
        myCar.start();          // Calls inherited method from Vehicle
        myCar.honk();          // Calls method specific to Car

        System.out.println("\nBike Details:");
        myBike.displayDetails(); // Calls overridden method in Bike
        myBike.start();           // Calls inherited method from Vehicle
        myBike.ringBell();        // Calls method specific to Bike
    }
}