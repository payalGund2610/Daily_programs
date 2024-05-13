package Multi_level_inheritance;

import java.util.Scanner;

public class Bank 
{
	int balance=0;
	int amount;
	Scanner sc =new Scanner(System.in);
	public void main_balance()
	{
		System.out.println("the account balance is:"+balance);
	}
	public void depo_Process()
	{
		System.out.println("Enter Your Amount:");
		amount=sc.nextInt();
		balance=balance+amount;
	}
	public void with_process()
	{
		System.out.println("Enter Your Amount:");
		amount=sc.nextInt();
		balance=balance-amount;
	}
}
