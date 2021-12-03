package scenario3;


import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
        	Scanner obj=new Scanner(System.in);
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            
            //scenario3
            System.out.println("entrer une chaine pour voir si elle est palindrome ou pas:");
            String palin=obj.nextLine();
            System.out.println(service1.Palindrome(palin));

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
