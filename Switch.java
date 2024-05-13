package conditional_statement;

import java.util.Scanner;

public class Switch 
{
	public static void main(String [] args)
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choices:");
		System.out.println("1) withdrawal\n2) change pin\n3) print last transection");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("enter amount and complete the process");
				break;
			case 2:
				System.out.println("change the pin");
				break;
			case 3:
				System.out.println("print last transection");
				break;
			default:
				System.out.println("please enter valid choice");
		}
	}
}















