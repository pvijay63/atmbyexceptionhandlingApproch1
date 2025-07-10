package atmException;

import java.util.Scanner;

public class Atm {

	 int amountBalance=1000;
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a deposit amount");
		int a=sc.nextInt();
		if(a>0)
		{
		 amountBalance=amountBalance+a;	
		 System.out.println(a+" depsosited amount successfully ");
		}
		else
		{
			throw new  DepositException ();
		}
	}
	
	public void withDraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		int n=sc.nextInt();
		if(n<=amountBalance)
		{
			amountBalance=amountBalance-n;
			System.out.println(n+" amount withdraw  successfully");
		}
		else
		{
			throw new WithDrawException();
		}
	}
	
	public void showBalance()
	{
		System.out.println("The current balnce is : "+amountBalance);
	}
	

}
