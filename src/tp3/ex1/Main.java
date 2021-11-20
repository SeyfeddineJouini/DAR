package tp3.ex1;

public class Main {

	// create a class that extends thread and another one that implements runnable
	// they should print 'my thread is running' when running
	// when both terminated, print 'it s over !!'

	public static void main(String[] args) {

		TH1 t1 = new TH1();
		TH2 t2 = new TH2();
		Thread tt = new Thread(t2);
		t1.start();
		tt.start();
		try {
			t1.join();
			tt.join();
		} catch (InterruptedException e) {
		}
		System.out.println("it s over !!");
		// output:
		// my thread is running
		// my thread is running
		// it s over !!
	}
}
