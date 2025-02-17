public class WrapperClassesExample {
    public static void main(String[] args) {
        // 1. Integer Wrapper Class
        Integer intObj1 = new Integer(42); // Constructor (deprecated in Java 9)
        Integer intObj2 = Integer.valueOf(100); // Recommended way
        int intPrimitive = intObj1.intValue(); // Unboxing
        System.out.println("1. Integer: " + intObj1 + ", " + intObj2 + ", Primitive: " + intPrimitive);

        // 2. Double Wrapper Class
        Double doubleObj1 = new Double(3.14); // Constructor (deprecated in Java 9)
        Double doubleObj2 = Double.valueOf(2.718); // Recommended way
        double doublePrimitive = doubleObj1.doubleValue(); // Unboxing
        System.out.println("2. Double: " + doubleObj1 + ", " + doubleObj2 + ", Primitive: " + doublePrimitive);

        // 3. Character Wrapper Class
        Character charObj1 = new Character('A'); // Constructor (deprecated in Java 9)
        Character charObj2 = Character.valueOf('Z'); // Recommended way
        char charPrimitive = charObj1.charValue(); // Unboxing
        System.out.println("3. Character: " + charObj1 + ", " + charObj2 + ", Primitive: " + charPrimitive);

        // 4. Boolean Wrapper Class
        Boolean boolObj1 = new Boolean(true); // Constructor (deprecated in Java 9)
        Boolean boolObj2 = Boolean.valueOf(false); // Recommended way
        boolean boolPrimitive = boolObj1.booleanValue(); // Unboxing
        System.out.println("4. Boolean: " + boolObj1 + ", " + boolObj2 + ", Primitive: " + boolPrimitive);

        // 5. Byte Wrapper Class
        Byte byteObj1 = new Byte((byte) 10); // Constructor (deprecated in Java 9)
        Byte byteObj2 = Byte.valueOf((byte) 20); // Recommended way
        byte bytePrimitive = byteObj1.byteValue(); // Unboxing
        System.out.println("5. Byte: " + byteObj1 + ", " + byteObj2 + ", Primitive: " + bytePrimitive);

        // 6. Short Wrapper Class
        Short shortObj1 = new Short((short) 100); // Constructor (deprecated in Java 9)
        Short shortObj2 = Short.valueOf((short) 200); // Recommended way
        short shortPrimitive = shortObj1.shortValue(); // Unboxing
        System.out.println("6. Short: " + shortObj1 + ", " + shortObj2 + ", Primitive: " + shortPrimitive);

        // 7. Long Wrapper Class
        Long longObj1 = new Long(1000L); // Constructor (deprecated in Java 9)
        Long longObj2 = Long.valueOf(2000L); // Recommended way
        long longPrimitive = longObj1.longValue(); // Unboxing
        System.out.println("7. Long: " + longObj1 + ", " + longObj2 + ", Primitive: " + longPrimitive);

        // 8. Float Wrapper Class
        Float floatObj1 = new Float(1.23f); // Constructor (deprecated in Java 9)
        Float floatObj2 = Float.valueOf(4.56f); // Recommended way
        float floatPrimitive = floatObj1.floatValue(); // Unboxing
        System.out.println("8. Float: " + floatObj1 + ", " + floatObj2 + ", Primitive: " + floatPrimitive);

        // Autoboxing and Unboxing
        Integer autoboxedInt = 42; // Autoboxing (primitive to wrapper)
        int unboxedInt = autoboxedInt; // Unboxing (wrapper to primitive)
        System.out.println("9. Autoboxing and Unboxing: " + autoboxedInt + ", " + unboxedInt);

        // Parsing Strings to Wrapper Classes
        Integer parsedInt = Integer.parseInt("123");
        Double parsedDouble = Double.parseDouble("45.67");
        System.out.println("10. Parsed Integer: " + parsedInt + ", Parsed Double: " + parsedDouble);

        // Converting Wrapper Classes to Strings
        String intToString = intObj1.toString();
        String doubleToString = doubleObj1.toString();
        System.out.println("11. Integer to String: " + intToString + ", Double to String: " + doubleToString);

        // Comparing Wrapper Objects
        System.out.println("12. Compare Integer 42 and 100: " + intObj1.compareTo(intObj2));
        System.out.println("13. Compare Double 3.14 and 2.718: " + doubleObj1.compareTo(doubleObj2));

        // Constants in Wrapper Classes
        System.out.println("14. Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("15. Double MIN_VALUE: " + Double.MIN_VALUE);
    }
}