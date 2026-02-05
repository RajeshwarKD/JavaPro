import java.util.Scanner;

public class DecisionStatementsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Simple if and if-else
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Status: You are an adult.");

            // 2. Nested-if (if inside an if)
            System.out.print("Do you have a driving license? (true/false): ");
            boolean hasLicense = sc.nextBoolean();

            if (hasLicense) {
                System.out.println("Result: You are allowed to drive.");
            } else {
                System.out.println("Result: You are an adult but cannot drive without a license.");
            }
        } else {
            System.out.println("Status: You are a minor.");
        }

        System.out.println("\n----------------------------");

        // 3. If-else-if Ladder (Range based)
        System.out.print("Enter your exam marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 33) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }

        System.out.println("\n----------------------------");

        // 4. Switch Statement (Value based)
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Day: Monday"); break;
            case 2: System.out.println("Day: Tuesday"); break;
            case 3: System.out.println("Day: Wednesday"); break;
            case 4: System.out.println("Day: Thursday"); break;
            case 5: System.out.println("Day: Friday"); break;
            case 6: System.out.println("Day: Saturday"); break;
            case 7: System.out.println("Day: Sunday"); break;
            default: System.out.println("Invalid: Please enter a number between 1 and 7.");
        }

        sc.close();
    }
}