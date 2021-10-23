package tp2;

import java.util.Scanner;

public class ISIGame {

    static class ISIException extends RuntimeException{
        public ISIException(String s) {
            super(s);
        }
    }

    public static void main(String[] args) {
       System.out.println("Enter a word");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        try {
        	
        	if(!line.toLowerCase().contains("isi"))
        		System.out.println("ok");
        	else {
        		throw new ISIException() ;
        	}
        }catch(ISIException e) {
        	System.out.println("life is not isi");
        }
        // now you have to check if the word contains 'isi' or not
        // if not print 'ok'
        // if yes throw the exception 'ISIException'
        // and when you catch it print 'life is not isi'
    }
}
