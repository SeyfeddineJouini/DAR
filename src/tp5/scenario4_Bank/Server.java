package scenario4_Bank;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {
	
	BankAccount bankAccount;
    public Server() throws RemoteException {}
    public void createAccount(int id,String userName, double balance) {
    	bankAccount=new BankAccount(id,userName,balance);
    	System.out.println(bankAccount);
    }
    public void ajoutArgent(double money) throws RemoteException {
		bankAccount.deposit(money);
		System.out.println(bankAccount);
		
	}
	public void retraitArgent(double money) throws RemoteException {
		bankAccount.withdraw(money);
		System.out.println(bankAccount);
		
	}
    
    

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
	
}
