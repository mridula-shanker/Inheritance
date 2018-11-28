
public class SavingsAccount extends BankAccount
{
	public final double INT_RATE= 0.25;
	
	public void addInterest()
	{
		deposit(INT_RATE * getBalance());
	}
}
