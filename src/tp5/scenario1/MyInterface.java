package scenario1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String upper(String s)throws RemoteException;
}

