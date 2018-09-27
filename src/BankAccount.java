/**
 * 
 * @author Philip Wellener
 * Comp Sci
 * Period 7
 *
 */

public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount(String n, int aN, double bal)
	{
		name = n;
		accNum = aN;
		balance = bal;
	}
	
	public BankAccount(String n, int aN)
	{
		name = n;
		accNum = aN;
		balance = 0;
	}

	public void withdraw(double amt)
	{
		balance -= amt;
	}
	
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Name: " + name + "\tAccount Number: " + accNum + "\tBalance: " + balance;
	}

}