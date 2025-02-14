package thirtyMinutesJAVA;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nextLine() - Reads a line of text
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();
        System.out.println("You entered: " + line);

        // next() - Reads a single word
        System.out.print("Enter a single word: ");
        String word = scanner.next();
        System.out.println("You entered: " + word);

        // nextInt() - Reads an integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        // nextDouble() - Reads a double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        // nextBoolean() - Reads a boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You entered: " + booleanValue);

        // nextByte() - Reads a byte
        System.out.print("Enter a byte: ");
        byte byteValue = scanner.nextByte();
        System.out.println("You entered: " + byteValue);

        // nextShort() - Reads a short
        System.out.print("Enter a short: ");
        short shortValue = scanner.nextShort();
        System.out.println("You entered: " + shortValue);

        // nextLong() - Reads a long
        System.out.print("Enter a long: ");
        long longValue = scanner.nextLong();
        System.out.println("You entered: " + longValue);

        // nextFloat() - Reads a float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("You entered: " + floatValue);

        // Use hasNextXXX() methods to check if the next token matches the expected type
        System.out.print("Enter a string to check hasNext(): ");
        if (scanner.hasNext()) {
            String next = scanner.next();
            System.out.println("hasNext() found: " + next);
        }

        // Use hasNextInt() to check if the next token is an integer
        System.out.print("Enter a string to check hasNextInt(): ");
        if (scanner.hasNextInt()) {
            int nextInt = scanner.nextInt();
            System.out.println("hasNextInt() found: " + nextInt);
        } else {
            System.out.println("hasNextInt() did not find an integer.");
        }

        // Use hasNextDouble() to check if the next token is a double
        System.out.print("Enter a string to check hasNextDouble(): ");
        if (scanner.hasNextDouble()) {
            double nextDouble = scanner.nextDouble();
            System.out.println("hasNextDouble() found: " + nextDouble);
        } else {
            System.out.println("hasNextDouble() did not find a double.");
        }

        // Use hasNextBoolean() to check if the next token is a boolean
        System.out.print("Enter a string to check hasNextBoolean(): ");
        if (scanner.hasNextBoolean()) {
            boolean nextBoolean = scanner.nextBoolean();
            System.out.println("hasNextBoolean() found: " + nextBoolean);
        } else {
            System.out.println("hasNextBoolean() did not find a boolean.");
        }

        // Close the scanner
        scanner.close();
    }
}