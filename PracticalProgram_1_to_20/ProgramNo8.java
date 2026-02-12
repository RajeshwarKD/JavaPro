public class ProgramNo8 {
    public static void main(String[] args) {
        // 1. Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 2. append() method
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // 3. insert() method
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // Output: Hello Java World

        // 4. replace() method
        sb.replace(6, 10, "Programming");
        System.out.println("After replace: " + sb); // Output: Hello Programming World

        // 5. delete() method
        sb.delete(6, 18);
        System.out.println("After delete: " + sb); // Output: Hello World

        // 6. reverse() method
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH

        // 7. capacity() method
        System.out.println("Capacity: " + sb.capacity()); // Output: 21 (default capacity is 16 + length of "Hello")

        // 8. ensureCapacity() method
        sb.ensureCapacity(50);
        System.out.println("New Capacity after ensureCapacity: " + sb.capacity()); // Output: 50

        // 9. setLength() method
        sb.setLength(5);
        System.out.println("After setLength: " + sb); // Output: dlroW

        // 10. charAt() method
        char ch = sb.charAt(0);
        System.out.println("Character at index 0: " + ch); // Output: d

        // 11. setCharAt() method
        sb.setCharAt(0, 'D');
        System.out.println("After setCharAt: " + sb); // Output: DlroW

        // 12. substring() method
        String subStr = sb.substring(1, 4);
        System.out.println("Substring from index 1 to 4: " + subStr); // Output: lro

        // 13. indexOf() method
        int index = sb.indexOf("ro");
        System.out.println("Index of 'ro': " + index); // Output: 2

        // 14. lastIndexOf() method
        int lastIndex = sb.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndex); // Output: 4

        // 15. length() method
        int length = sb.length();
        System.out.println("Length of StringBuffer: " + length); // Output: 5

        // 16. toString() method
        String str = sb.toString();
        System.out.println("String representation: " + str); // Output: DlroW
    }
}