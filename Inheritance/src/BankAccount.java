
public class BankAccount 
{
	private double balance;
	
	public BankAccount()
	{
		balance = 0;
	}
	
	public void deposit(double amt)
	{
		balance = amt+balance;
	}
	
	public void withdraw(double amt)
	{
		balance=balance-amt;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
}
	
