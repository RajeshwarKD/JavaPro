public class LoopsDemo {
    public static void main(String[] args) {

        // 1. FOR LOOP
        // Use: When you know the exact number of iterations (e.g., 1 to 5).
        System.out.println("--- 1. For Loop (Counting 1 to 3) ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration: " + i);
        }

        // 2. WHILE LOOP
        // Use: When the loop depends on a condition being true.
        System.out.println("\n--- 2. While Loop (Counting down) ---");
        int count = 3;
        while (count > 0) {
            System.out.println("Count: " + count);
            count--; // Reducing count to eventually stop the loop
        }

        // 3. DO-WHILE LOOP
        // Use: When you want the code to run AT LEAST once.
        System.out.println("\n--- 3. Do-While Loop (Executes once guaranteed) ---");
        int num = 10;
        do {
            System.out.println("This prints even though num is not < 5");
        } while (num < 5);

        // 4. FOR-EACH LOOP (Enhanced For Loop)
        // Use: To easily iterate through arrays or collections.
        System.out.println("\n--- 4. For-Each Loop (Iterating Array) ---");
        String[] subjects = {"Java", "Python", "C++"};
        for (String sub : subjects) {
            System.out.println("Subject: " + sub);
        }
    }
}