package scenario2;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public int position(String s,char c) {
    	int p=-1;
      for(int i=0;i<s.length()&&p==-1;i++)
      	if(s.charAt(i)==c)
      		p=i+1;
      return p;
      
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}

