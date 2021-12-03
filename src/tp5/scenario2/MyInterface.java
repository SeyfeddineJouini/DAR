package scenario2;

import java.rmi.RemoteException;

public interface MyInterface {
	
    int position(String s,char c)throws RemoteException;
}
