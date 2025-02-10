package checkedException;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to load a class that does not exist
            Class.forName("com.nonexistent.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}

