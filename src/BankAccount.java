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
	
	public BankAccount(String name, int accNum)
	{
		name = "Philip Wellener";
		accNum = 14;
	}
	
	public BankAccount(double balance)
	{
		balance = 0;
	}
	
	public void deposit(double deposit)
	{
		balance = balance + deposit;
	}
	
	public void withdraw(double withdraw)
	{
		balance = balance - withdraw;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	//Error with toString
	//Type mismatch: cannot convert from int/double to String
	public String toString()
	{
		return name;
		return accNum;
		return balance;
	}

}