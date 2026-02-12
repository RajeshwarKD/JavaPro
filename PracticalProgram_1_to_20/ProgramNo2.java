class StringDuplicator {
    String data;

    // Standard constructor to initialize with a value
    StringDuplicator(String data) {
        this.data = data;
    }

    // Copy Constructor: Takes an object of the same class as a parameter
    StringDuplicator(StringDuplicator original) {
        this.data = original.data; // Duplicates the reference/value
    }

    void display(String label) {
        System.out.println(label + ": " + data);
    }
}

public class ProgramNo2 {
    public static void main(String[] args) {
        // 1. Original Object
        StringDuplicator originalObj = new StringDuplicator("Hello World!");

        // 2. Duplication via Copy Constructor
        StringDuplicator copiedObj = new StringDuplicator(originalObj);

        // 3. Duplication via Assignment (Points to the same memory location)
        StringDuplicator assignedObj = originalObj;

        // Display results
        originalObj.display("Original");
        copiedObj.display("Copied (via Constructor)");
        assignedObj.display("Assigned (via Reference)");

        // To prove it's a copy:
        System.out.println("\nIs copiedObj the same instance as originalObj? " + (originalObj == copiedObj));
        System.out.println("Is assignedObj the same instance as originalObj? " + (originalObj == assignedObj));
    }
}