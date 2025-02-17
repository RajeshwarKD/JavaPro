public class String_Buffer_Builder {

    public static void main(String[] args) {
        // Using String
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Concatenating to String (creates a new object)
        str = str + " World";
        System.out.println("Modified String: " + str);

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("\nOriginal StringBuffer: " + stringBuffer);

        // Appending to StringBuffer (modifies the same object)
        stringBuffer.append(" World");
        System.out.println("Modified StringBuffer: " + stringBuffer);

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("\nOriginal StringBuilder: " + stringBuilder);

        // Appending to StringBuilder (modifies the same object)
        stringBuilder.append(" World");
        System.out.println("Modified StringBuilder: " + stringBuilder);

        // Comparing performance
        long startTime;

        // String concatenation in a loop
        startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += i;
        }
        System.out.println("\nTime taken by String concatenation: " + (System.currentTimeMillis() - startTime) + " ms");

        // StringBuffer concatenation in a loop
        startTime = System.currentTimeMillis();
        StringBuffer bufferResult = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            bufferResult.append(i);
        }
        System.out.println("Time taken by StringBuffer concatenation: " + (System.currentTimeMillis() - startTime) + " ms");

        // StringBuilder concatenation in a loop
        startTime = System.currentTimeMillis();
        StringBuilder builderResult = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builderResult.append(i);
        }
        System.out.println("Time taken by StringBuilder concatenation: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}