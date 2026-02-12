public class ProgramNo7 {
    public static void main(String[] args) {
        // Create a sample string
        String str = "Hello, World!";

        // 1. length() - Returns the length of the string
        System.out.println("1. Length of the string: " + str.length());

        // 2. charAt(int index) - Returns the character at the specified index
        System.out.println("2. Character at index 4: " + str.charAt(4));

        // 3. substring(int beginIndex) - Returns a substring from the specified index to the end
        System.out.println("3. Substring from index 7: " + str.substring(7));

        // 4. substring(int beginIndex, int endIndex) - Returns a substring within the specified range
        System.out.println("4. Substring from index 0 to 5: " + str.substring(0, 5));

        // 5. concat(String str) - Concatenates the specified string to the end
        System.out.println("5. Concatenated string: " + str.concat(" Welcome!"));

        // 6. toUpperCase() - Converts the string to uppercase
        System.out.println("6. Uppercase string: " + str.toUpperCase());

        // 7. toLowerCase() - Converts the string to lowercase
        System.out.println("7. Lowercase string: " + str.toLowerCase());

        // 8. trim() - Removes leading and trailing whitespace
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("8. Trimmed string: '" + strWithSpaces.trim() + "'");

        // 9. replace(char oldChar, char newChar) - Replaces all occurrences of a character
        System.out.println("9. Replaced 'l' with 'L': " + str.replace('l', 'L'));

        // 10. replace(CharSequence target, CharSequence replacement) - Replaces all occurrences of a sequence
        System.out.println("10. Replaced 'World' with 'Java': " + str.replace("World", "Java"));

        // 11. contains(CharSequence sequence) - Checks if the string contains the specified sequence
        System.out.println("11. Contains 'World': " + str.contains("World"));

        // 12. startsWith(String prefix) - Checks if the string starts with the specified prefix
        System.out.println("12. Starts with 'Hello': " + str.startsWith("Hello"));

        // 13. endsWith(String suffix) - Checks if the string ends with the specified suffix
        System.out.println("13. Ends with '!': " + str.endsWith("!"));

        // 14. indexOf(String str) - Returns the index of the first occurrence of the specified substring
        System.out.println("14. Index of 'World': " + str.indexOf("World"));

        // 15. lastIndexOf(String str) - Returns the index of the last occurrence of the specified substring
        System.out.println("15. Last index of 'l': " + str.lastIndexOf("l"));

        // 16. equals(Object obj) - Compares the string to the specified object
        String str2 = "Hello, World!";
        System.out.println("16. Equals 'Hello, World!': " + str.equals(str2));

        // 17. equalsIgnoreCase(String anotherString) - Compares strings ignoring case
        String str3 = "hello, world!";
        System.out.println("17. Equals ignore case: " + str.equalsIgnoreCase(str3));

        // 18. compareTo(String anotherString) - Compares two strings lexicographically
        System.out.println("18. Compare to 'Hello, Java!': " + str.compareTo("Hello, Java!"));

        // 19. isEmpty() - Checks if the string is empty
        String emptyStr = "";
        System.out.println("19. Is empty: " + emptyStr.isEmpty());

        // 20. split(String regex) - Splits the string into an array based on the regex
        String[] splitArray = str.split(", ");
        System.out.println("20. Split string: ");
        for (String s : splitArray) {
            System.out.println("   - " + s);
        }

        // 21. toCharArray() - Converts the string to a character array
        char[] charArray = str.toCharArray();
        System.out.println("21. Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 22. valueOf() - Converts different types to a string
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("22. String value of 123: " + numStr);

        // 23. matches(String regex) - Checks if the string matches the given regex
        System.out.println("23. Matches regex 'Hello.*': " + str.matches("Hello.*"));

        // 24. format() - Formats a string
        String formattedStr = String.format("Formatted: %s, Number: %d", str, 42);
        System.out.println("24. Formatted string: " + formattedStr);

        // 25. join() - Joins strings with a delimiter
        String joinedStr = String.join(" - ", "Hello", "World", "Java");
        System.out.println("25. Joined string: " + joinedStr);
    }
}