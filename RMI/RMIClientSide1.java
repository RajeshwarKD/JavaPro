import java.rmi.Naming;

// Client Class-------------------------------------------------
public class RMIClientSide1 {
    public static void main(String[] args) {
        try {
            // Get the registry on the server's host (localhost in this case)
            // Look up the remote object
            RMIInterface1 obj = (RMIInterface1) Naming.lookup("rmi://localhost:1099/RMIService");

            // Call the remote method
            int result = obj.add(15, 25);

            System.out.println("Sum = " + result);
        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
