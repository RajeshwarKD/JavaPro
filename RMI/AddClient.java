import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AddClient {
    public static void main(String[] args) {
        try {
            // Get the registry on the server's host (localhost in this case)
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            
            // Look up the remote object
            AddService addService = (AddService) registry.lookup("AddService");
            
            // Call the remote method
            int num1 = 5;
            int num2 = 10;
            int result = addService.add(num1, num2);
            
            System.out.println("Result of adding " + num1 + " and " + num2 + " is: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}