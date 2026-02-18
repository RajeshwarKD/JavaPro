// Part 1: Engine Class - Independent class
class Engine {
    void start() {
        System.out.println("Engine: Vroom! Engine started.");
    }
}

// Part 2: MusicPlayer Class - Independent class
class MusicPlayer {
    void play() {
        System.out.println("Music Player: Playing music...");
    }
}

// The Main Class that HAS-A relationship with the others - Container Class
class Car {
    Engine engine;  // Car "HAS-A" Engine (Composition)
    MusicPlayer music; // Car "HAS-A" MusicPlayer (Aggregation)

    Car(MusicPlayer play) {
        // 1. COMPOSITION (Strong Relationship) : The car creates its own engine (Owns it)
        // The Engine is created INSIDE the Car.
        // If the Car is destroyed, the Engine is also destroyed.
        this.engine = new Engine();
        // 2. AGGREGATION (Weak Relationship) : The car gets a player from outside (Borrows it)
        // The MusicPlayer is passed from outside via the constructor.
        // If the Car is destroyed, the MusicPlayer can still exist elsewhere.
        this.music = play;
    }

    void drive() {
        engine.start(); // Using Composition
        music.play();  // Using Aggregation
        System.out.println("Car: The car is moving!");
    }
}

public class HAS_A {
    public static void main(String[] args) {
        // // Step 1: Create the MusicPlayer separately (It exists on its own)
        MusicPlayer m = new MusicPlayer();
        // Step 2: Create a Car and give it the MusicPlayer/ Pass the player to the Car (Aggregation)
        Car c = new Car(m);
        // Step 3: Run the car
        c.drive();
    }
}