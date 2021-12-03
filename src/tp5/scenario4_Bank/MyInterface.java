package scenario4_Bank;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

	public void createAccount(int id,String userName, double balance) throws RemoteException;
	public void ajoutArgent(double money) throws RemoteException;
	public void retraitArgent(double money)throws RemoteException;
}
