public class BoxingUnboxingExample {
    public static void main(String[] args) {
        // Boxing: Converting primitive types to wrapper objects
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        boolean primitiveBoolean = true;

        // Boxing using valueOf() method
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Boxing int to Integer
        Double wrappedDouble = Double.valueOf(primitiveDouble); // Boxing double to Double
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean); // Boxing boolean to Boolean

        // Auto-boxing (automatically done by the compiler)
        Integer autoWrappedInt = primitiveInt; // Auto-boxing int to Integer
        Double autoWrappedDouble = primitiveDouble; // Auto-boxing double to Double
        Boolean autoWrappedBoolean = primitiveBoolean; // Auto-boxing boolean to Boolean

        // Unboxing: Converting wrapper objects back to primitive types
        int unboxedInt = wrappedInt.intValue(); // Unboxing Integer to int
        double unboxedDouble = wrappedDouble.doubleValue(); // Unboxing Double to double
        boolean unboxedBoolean = wrappedBoolean.booleanValue(); // Unboxing Boolean to boolean

        // Auto-unboxing (automatically done by the compiler)
        int autoUnboxedInt = wrappedInt; // Auto-unboxing Integer to int
        double autoUnboxedDouble = wrappedDouble; // Auto-unboxing Double to double
        boolean autoUnboxedBoolean = wrappedBoolean; // Auto-unboxing Boolean to boolean

        // Display results
        System.out.println("Boxing and Unboxing Example:");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);

        System.out.println("\nPrimitive double: " + primitiveDouble);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Unboxed double: " + unboxedDouble);
        System.out.println("Auto-unboxed double: " + autoUnboxedDouble);

        System.out.println("\nPrimitive boolean: " + primitiveBoolean);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);
        System.out.println("Unboxed boolean: " + unboxedBoolean);
        System.out.println("Auto-unboxed boolean: " + autoUnboxedBoolean);
    }
}