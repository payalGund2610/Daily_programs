package inheritance;

import java.util.Scanner;

public class Programmer 
{
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	public void App_develop()
	{
		System.out.println("Enter Your Number:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("num1 is grater");
		}				
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println("num2 is greater");	
		}
		else if(num3>=num1 && num3>=num2)
		{
			System.out.println("num3 is grater");
		}
	}
}
