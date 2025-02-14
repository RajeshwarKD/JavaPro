package thirtyMinutesJAVA;

public class DataTypesDemo {
    public static void main(String[] args) {
        // byte: 8-bit signed integer
        byte byteVar = 127;
        System.out.println("byte: " + byteVar);

        // short: 16-bit signed integer
        short shortVar = 32767;
        System.out.println("short: " + shortVar);

        // int: 32-bit signed integer
        int intVar = 2147483647;
        System.out.println("int: " + intVar);

        // long: 64-bit signed integer
        long longVar = 9223372036854775807L;
        System.out.println("long: " + longVar);

        // float: single-precision 32-bit IEEE 754 floating point
        float floatVar = 3.14f;
        System.out.println("float: " + floatVar);

        // double: double-precision 64-bit IEEE 754 floating point
        double doubleVar = 3.141592653589793;
        System.out.println("double: " + doubleVar);

        // boolean: true or false
        boolean booleanVar = true;
        System.out.println("boolean: " + booleanVar);

        // char: single 16-bit Unicode character
        char charVar = 'A';
        System.out.println("char: " + charVar);

        // String: a sequence of characters (not a primitive type, but commonly used)
        String stringVar = "Hello, World!";
        System.out.println("String: " + stringVar);
    }
}
