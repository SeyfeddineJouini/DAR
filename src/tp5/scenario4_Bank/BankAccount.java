package scenario4_Bank;

public class BankAccount {

	private int id;
	private String userName;
	private double balance;
	
	
	public BankAccount() {
		
	}


	public BankAccount(int id,String userName, double balance) {
		this.id=id;
		this.userName = userName;
		this.balance = balance;
	}


	public void deposit(double money) {
		this.balance+=money;
	}
	public void withdraw(double money) {
		this.balance-=money;

	}


	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", userName=" + userName + ", balance=" + balance + "]";
	}
	







}
