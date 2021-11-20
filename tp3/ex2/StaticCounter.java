package tp3.ex2;

public class StaticCounter {
    private static int counter = 0;

    // todo : implement me
    public synchronized static void increment(){
        //increment counter and print it
    	counter++;
    	System.out.println(counter);
    }
}
