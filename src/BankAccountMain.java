
public class BankAccountMain 
{

	public static void main(String[] args) 
	{
		BankAccount ba1 = new BankAccount("Wellener", 11111, 500);
		BankAccount ba2 = new BankAccount("Wellener", 22222);
		
		System.out.println(ba1);
		System.out.println(ba2);
		
		ba1.deposit(10);
		ba2.deposit(30);
		System.out.println(ba1);
		System.out.println(ba2);
		
		ba1.withdraw(130);
		ba2.withdraw(200);
		System.out.println(ba1);
		System.out.println(ba2);
		
		System.out.println(ba1.getBalance());
		System.out.println(ba2.getBalance());
		

	}

}
