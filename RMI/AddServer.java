import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AddServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            AddServiceImpl addService = new AddServiceImpl();
            
            // Create and start the RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);
            
            // Bind the remote object to the registry
            registry.rebind("AddService", addService);
            
            System.out.println("Server is running and waiting for client requests...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}