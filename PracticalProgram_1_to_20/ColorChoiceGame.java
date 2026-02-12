import java.util.Scanner;

public class ColorChoiceGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Colors List
        String[] colors = {
                "", "Red", "Blue", "Green", "Yellow", "Black",
                "White", "Pink", "Orange", "Purple", "Brown"
        };

        // 2. Final Updated Loop Lists (Weights: L1=1, L2=2, L3=3, L4=4)
        // Pink(7) is now in Loop 1, Loop 2, and Loop 4 (1+2+4=7)
        int[][] loopLists = {
                {1, 3, 4, 5, 6, 7, 8, 10}, // Loop 1 (Weight 1)
                {2, 3, 6, 7, 9, 10},       // Loop 2 (Weight 2)
                {4, 6, 8, 9, 10},          // Loop 3 (Weight 3)
                {5, 7, 8, 9, 10}           // Loop 4 (Weight 4)
        };

        System.out.println("==========================================");
        System.out.println("   WELCOME TO THE COLOR GUESSING GAME   ");
        System.out.println("==========================================");

        System.out.println("\nEk color mann mein sochiye (1-10):");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "." + colors[i] + "  ");
        }
        System.out.println("\n------------------------------------------");

        int resultSum = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("\nLoop " + (i + 1) + " ki List:");
            System.out.print("[ ");
            for (int colorIdx : loopLists[i]) {
                System.out.print(colors[colorIdx] + " ");
            }
            System.out.println("]");

            System.out.print("Kya ismein aapka color hai? (y/n): ");
            char choice = sc.next().toLowerCase().charAt(0);

            if (choice == 'y') {
                resultSum += (i + 1);
            }
        }

        System.out.println("\n------------------------------------------");
        if (resultSum >= 1 && resultSum <= 10) {
            System.out.println("Aapka chuna hua color hai: *** " + colors[resultSum].toUpperCase() + " ***");
            System.out.println("Logic Detail: " + getAllColorsHelper(resultSum, colors[resultSum]));
        } else if (resultSum == 0) {
            System.out.println("Aapne kisi bhi list mein 'y' nahi chuna!");
        } else {
            System.out.println("Opps! Calculation sum " + resultSum + " aaya, jo valid range se bahar hai.");
        }
        System.out.println("------------------------------------------");

        sc.close();
    }

    // UPDATED HELPER METHOD: New Logic for Pink (7)
    public static String getAllColorsHelper(int sum, String colorName) {
        switch (sum) {
            case 1: return "Loop 1 (1) = 1 (" + colorName + ")";
            case 2: return "Loop 2 (2) = 2 (" + colorName + ")";
            case 3: return "Loop 1 (1) + Loop 2 (2) = 3 (" + colorName + ")";
            case 4: return "Loop 1 (1) + Loop 3 (3) = 4 (" + colorName + ")";
            case 5: return "Loop 1 (1) + Loop 4 (4) = 5 (" + colorName + ")";
            case 6: return "Loop 1 (1) + Loop 2 (2) + Loop 3 (3) = 6 (" + colorName + ")";
            case 7: return "Loop 1 (1) + Loop 2 (2) + Loop 4 (4) = 7 (" + colorName + ")";
            case 8: return "Loop 1 (1) + Loop 3 (3) + Loop 4 (4) = 8 (" + colorName + ")";
            case 9: return "Loop 2 (2) + Loop 3 (3) + Loop 4 (4) = 9 (" + colorName + ")";
            case 10: return "Loop 1 (1) + Loop 2 (2) + Loop 3 (3) + Loop 4 (4) = 10 (" + colorName + ")";
            default: return "Unknown Calculation";
        }
    }
}