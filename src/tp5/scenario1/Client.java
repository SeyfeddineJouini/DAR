package scenario1;


import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
        	Scanner obj=new Scanner(System.in);
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            //secenario1
            System.out.println("Entrer une chaîne à convertir en majuscule");
            String s = obj.nextLine();
            System.out.println(service1.upper(s));
            
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
