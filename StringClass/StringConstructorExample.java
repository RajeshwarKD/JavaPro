public class StringConstructorExample {
    public static void main(String[] args) {
        // 1. Default constructor (creates an empty string)
        String emptyString = new String();
        System.out.println("1. Empty String: '" + emptyString + "'");

        // 2. String(String original)
        String originalString = new String("Hello, World!");
        System.out.println("2. Original String: '" + originalString + "'");

        // 3. String(char[] value)
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String charArrayString = new String(charArray);
        System.out.println("3. String from char array: '" + charArrayString + "'");

        // 4. String(char[] value, int offset, int count)
        String subCharArrayString = new String(charArray, 1, 3);
        System.out.println("4. Substring from char array: '" + subCharArrayString + "'");

        // 5. String(byte[] bytes)
        byte[] byteArray = {72, 101, 108, 108, 111}; // ASCII values for 'H', 'e', 'l', 'l', 'o'
        String byteArrayString = new String(byteArray);
        System.out.println("5. String from byte array: '" + byteArrayString + "'");

        // 6. String(byte[] bytes, int offset, int length)
        String subByteArrayString = new String(byteArray, 1, 3);
        System.out.println("6. Substring from byte array: '" + subByteArrayString + "'");

        // 7. String(int[] codePoints, int offset, int count)
        int[] codePoints = {72, 101, 108, 108, 111}; // Unicode code points for 'H', 'e', 'l', 'l', 'o'
        String codePointString = new String(codePoints, 0, codePoints.length);
        System.out.println("7. String from code points: '" + codePointString + "'");

        // 8. String(byte[] bytes, Charset charset)
        String charsetString = new String(byteArray, java.nio.charset.StandardCharsets.UTF_8);
        System.out.println("8. String from byte array with charset: '" + charsetString + "'");


        // 9. String(byte[] bytes, String charsetName)
        try {
            String charsetNameString = new String(byteArray, "UTF-8");
            System.out.println("9. String from byte array with charset name: '" + charsetNameString + "'");
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // 10. String(StringBuffer buffer)
        StringBuffer stringBuffer = new StringBuffer("Hello, StringBuffer!");
        String stringBufferString = new String(stringBuffer);
        System.out.println("10. String from StringBuffer: '" + stringBufferString + "'");

        // 11. String(StringBuilder builder)
        StringBuilder stringBuilder = new StringBuilder("Hello, StringBuilder!");
        String stringBuilderString = new String(stringBuilder);
        System.out.println("11. String from StringBuilder: '" + stringBuilderString + "'");
    }
}

//Explanation:
//1. Default Constructor: Creates an empty String object.
//2. String(String original): Creates a new String object from an existing String.
//3. String(char[] value): Creates a new String from a character array.
//4. String(char[] value, int offset, int count): Creates a new String from a subarray of characters.
//5. String(byte[] bytes): Creates a new String by decoding a byte array using the platform's default charset.
//6. String(byte[] bytes, int offset, int length): Creates a new String by decoding a subarray of bytes using the platform's default charset.
//7. String(int[] codePoints, int offset, int count): Creates a new String from a subarray of Unicode code points.
//8. String(byte[] bytes, Charset charset): Creates a new String by decoding a byte array using the specified charset.
//9. String(byte[] bytes, String charsetName): Creates a new String by decoding a byte array using the specified charset name.
//10. String(StringBuffer buffer): Creates a new String from a StringBuffer.
//11. String(StringBuilder builder): Creates a new String from a StringBuilder.