public class tryCatchFinally {
    public static void main(String[] args) {
        try {
            //  Block of code to try
            int num1=30, num2=0;
            int output=num1/num2;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e) {
            //  Block of code to handle errors
            System.out.println("You Shouldn't divide a number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            //  Block of code to handle errors
            System.out.println("Array index out of bounds error");
        }
        catch(ArrayStoreException e) {
            //  Block of code to handle errors
            System.out.println("Wrong data type");
        }
        finally {
            System.out.println("I am always here");
        }
    }
}

