import java.util.*;
class myException extends Exception {
    myException(String message) {
        super(message);
    }
}
public class throwThrows {
    public static void main(String[] args) throws myException { //userDefineException
        System.out.print("Enter marks: ");
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();

        if( marks > 100 )  {
            throw new myException ("Input marks greater than 100 ");
        }
        else
            System.out.println("Marks: "+marks);
    }
}
