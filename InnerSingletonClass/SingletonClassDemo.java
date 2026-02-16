//How to create a Singleton:
//Private Constructor: Prevents other classes from creating new instances.
//Private Static Variable: Holds the single instance of the class.
//Public Static Method: Provides the only way to get the instance.

class TVRemote {
    // 1. The ONLY remote in the house
    private static TVRemote instance;

    // 2. Lock the door (Private constructor)
    // No one can use 'new TVRemote()' outside this class
    private TVRemote() { }

    // 3. The only way to get the remote
    public static TVRemote getInstance() {
        if (instance == null) {
            instance = new TVRemote(); // Create it once
        }
        return instance;
    }

    void use() {
        System.out.println("Using the same remote!");
    }
}

public class SingletonClassDemo {
    public static void main(String[] args) {
//        TVRemote obj1 = new TVRemote(); // No one can use 'new TVRemote()' outside this class becouse constructor as private

        // Everyone gets the SAME remote
        TVRemote person1 = TVRemote.getInstance();
        TVRemote person2 = TVRemote.getInstance();

        person1.use();
        person2.use();

        // Proof: It's the same object
        System.out.println(person1 == person2); // Prints: true
    }
}