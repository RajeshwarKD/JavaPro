// Association (HAS-A), Aggregation & Composition - Relationship in Java
// Composition: Car has a strong relationship with Engine. The Engine object is created within the Car class.
// Aggregation: Car has a weak relationship with MusicPlayer. The MusicPlayer object is passed to the Car class.

class Engine { // Composition example
    void start() {
        System.out.println("Engine started");
    }

    void stop() {
        System.out.println("Engine stopped");
    }
}

class MusicPlayer { // Aggregation example
    void playMusic() {
        System.out.println("Playing music");
    }

    void stopMusic() {
        System.out.println("Music stopped");
    }
}

// Car class demonstrating both composition and aggregation
class Car {
    private Engine engine; // Car "HAS-A" Engine (Composition)
    private MusicPlayer musicPlayer; // Car "HAS-A" MusicPlayer (Aggregation)

    Car(MusicPlayer musicPlayer) {
        this.engine = new Engine(); // Engine is created when Car is created
        this.musicPlayer = musicPlayer; // MusicPlayer is passed to Car
    }

    void drive() {
        engine.start();
        musicPlayer.playMusic();
        System.out.println("Car is driving");
    }

    void park() {
        engine.stop();
        musicPlayer.stopMusic();
        System.out.println("Car is parked");
    }
}

public class associationRelationship {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Car car = new Car(musicPlayer);

        car.drive();
        car.park();
    }
}
