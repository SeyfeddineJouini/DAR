package scenario2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        // Listen to a specific port

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Waiting for connection");
        Socket socClient = serverSocket.accept(); // Accept a client socket
        System.out.println("Connection established");

        // Initialize in / out
        BufferedReader inServer = new BufferedReader(new InputStreamReader(socClient.getInputStream()));
        PrintWriter outServer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socClient.getOutputStream())), true);
 
        
        
        String s=inServer.readLine();
        String c=inServer.readLine();
        int p=-1;
        for(int i=0;i<s.length()&&p==-1;i++)
        	if(s.charAt(i)==c.charAt(0))
        		p=i+1;
        outServer.println(p);
        
        
      
        
        
        
        
        
        	
        
        // ****** if you're using DataInputStream & DataOutputStream ******

        //DataInputStream inServer = new DataInputStream(socClient.getInputStream());
        //DataOutputStream outServer = new DataOutputStream(socClient.getOutputStream());

        // Read message sent by the client
        //String s = inServer.readUTF();
        //String strUpper = str.toUpperCase();
        //System.out.println("The msg was " + strUpper);

        // ****** if you're using DataInputStream & DataOutputStream ******

        // Close in / out
        inServer.close();
        outServer.close();

        // Close client socket
        socClient.close();
        serverSocket.close();
    }
}
