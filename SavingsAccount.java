
public class SavingsAccount extends BankAccount {
	
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		this.savingsNumber += 1;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		super.deposit(super.getBalance() * (rate / 1200));
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
