package Function;

import java.util.Scanner;

public class Arithmatic_oper_function 
{
	int result,choice;
	Scanner sc=new Scanner(System.in);
	void  User_Choices()
	{
		int num1,num2;
		do
		{
			System.out.println("Enter Your First Number:");
			num1=sc.nextInt();
			System.out.println("Enter Your Second Number:");
			num2=sc.nextInt();
			System.out.println(" 1.Addition\n 2.Substraction\n 3.Multiplaction\n 4.Division\n 5.Mod\n 6.exit");
			System.out.println("enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					Addition(num1,num2);
					break;
				case 2:
					Substraction(num1,num2);
					break;
				case 3:
					Multiplaction(num1,num2);
					break;
				case 4:
					Division(num1,num2);
					break;
				case 5:
					Mod(num1,num2);
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("enter valid choice only");
			}
		}while(true);
	}

	public void Addition(int num1,int num2)
	{
		result=num1+num2;
		System.out.println("Addition of Two number:"+result);
	}
	public void Substraction(int num1,int num2)
	{
		result=num1-num2;
		System.out.println(" Substraction of Two number:"+result);
	}
	public void Multiplaction(int num1,int num2)
	{
		result=num1*num2;
		System.out.println(" Multiplaction of Two number:"+result);
	}
	public void Division(int num1,int num2)
	{
		result=num1/num2;
		System.out.println(" Division of Two number:"+result);
	}
	public void Mod(int num1,int num2)
	{
		result=num1%num2;
		System.out.println(" Modulous of Two number:"+result);
	}
	public static void main(String[] args) 
	{
		Arithmatic_oper_function  aof=new Arithmatic_oper_function ();
		aof.User_Choices();		
	}
}
