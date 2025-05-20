import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddService extends Remote {
    public int add(int num1, int num2) throws RemoteException;
}