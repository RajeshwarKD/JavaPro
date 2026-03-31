import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

class RMIImplement extends UnicastRemoteObject implements RMIInterface {

    RMIImplement() throws RemoteException {
        super();
    }
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}