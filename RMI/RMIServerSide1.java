import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;

// Remote Interface-------------------------------------------------
interface RMIInterface1 extends Remote {
    int add(int a, int b) throws RemoteException;
}
// Implementation-------------------------------------------------
class RMIImplement1 extends UnicastRemoteObject implements RMIInterface1 {

    RMIImplement1() throws RemoteException {
        super();
    }
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
// Server Class-------------------------------------------------
public class RMIServerSide1 {
    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            RMIImplement1 obj = new RMIImplement1();

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
