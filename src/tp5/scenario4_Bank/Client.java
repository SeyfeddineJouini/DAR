package scenario4_Bank;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
        	
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            service1.createAccount(1, "seyf", 5000.0);
            service1.ajoutArgent(250.0);
            service1.retraitArgent(300.0);
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
