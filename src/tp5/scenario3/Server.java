package scenario3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public String Palindrome(String s) {
    	String v="";
        for(int i=s.length()-1;i>=0;i--)
        	v+=s.charAt(i);
        if(v.equals(s))
        	return("La chaîne: "+s+" est palindrome");
        else
        	return("La chaîne: "+s+" n'est pas palindrome");
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}

