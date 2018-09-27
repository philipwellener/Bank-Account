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
	
	public BankAccount(String name, int accNumber)
	{
		name = "Philip Wellener";
		accNum = accNumber;
		balance = 0;
	}
	
	public BankAccount(String name, int accNum, double bal)
	{
		name = "Philip Wellener";
		accNum = 14;
		balance = bal;
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
	
	public String toString()
	{
		return "Name: " + name + "\naccNum: " + accNum + "\nBalance: " + balance;
	}

}