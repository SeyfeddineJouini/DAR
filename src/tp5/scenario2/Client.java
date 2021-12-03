package scenario2;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
        	Scanner obj=new Scanner(System.in);
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            
            //scenario2
            System.out.println("Entrer une chaîne et un caractère à trouver dans la chaîne entrée précédement");
            String ch = obj.nextLine();
            char c=obj.nextLine().charAt(0);
            System.out.println("positioin de "+c+" dans "+ch+" est: "+service1.position(ch, c));
            
            

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
