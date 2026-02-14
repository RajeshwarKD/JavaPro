import java.util.HashSet;

public class ProgramNo19 {
    public static void main(String[] args) {
        // Integer array for Nested Loop Method
        int[] numbers = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        // String array for HashSet Method
        String[] languages = {"Java", "Python", "C++", "Java", "Ruby", "C++"};

        System.out.println("=== Duplicate Detection using Nested Loop ===");
        findDuplicateNested(numbers);
        System.out.println("\n=== Duplicate Detection using HashSet ===");
        findDuplicateHash(languages);
    }

    // Method 1: Nested Loop (Brute Force)
    public static void findDuplicateNested(int[] arr) {
        // Compare each element with others
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
    }

    // Method 2: HashSet (Optimized)
    public static void findDuplicateHash(String[] arr) {
        HashSet<String> set = new HashSet<>();

        for (String element : arr) {
            // .add() returns false if the element already exists in the set
            if (!set.add(element)) {
                System.out.println(element);
            }
        }
    }
}
