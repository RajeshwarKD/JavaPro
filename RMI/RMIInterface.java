import java.rmi.Remote;
import java.rmi.RemoteException;

interface RMIInterface extends Remote {
    int add(int a, int b) throws RemoteException;
}