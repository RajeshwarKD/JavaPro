import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            RMIImplement obj = new RMIImplement();

            // Create and start the default port of RMI registry at 1099
            LocateRegistry.createRegistry(1099);

            // Bind the remote object to the Naming
            Naming.rebind("rmi://localhost:1099/RMIService", obj);

            System.out.println("Server Ready & Registry Created Automatically...");
        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}