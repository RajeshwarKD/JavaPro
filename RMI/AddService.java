import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServiceImpl extends UnicastRemoteObject implements AddService {
    
    public AddServiceImpl() throws RemoteException {
        super();
    }
    
    @Override
    public int add(int num1, int num2) throws RemoteException {
        return num1 + num2;
    }
}