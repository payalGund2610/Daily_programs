//Write a program to perform the choice 
//sum of digit
//prime no
//fibonacci series using function.
package Function;

import java.util.Scanner;

public class Task1 
{
		int num;
		Scanner sc=new Scanner(System.in);
		public void User_choice()
		{
			int choice;
			do
			{
			System.out.println("\n********MENU**********");
			System.out.println("\n1) Sum of Digit\n2) Prime Number\n3) Fibonacci series\n");
			System.out.println("Enter your choice=");
			choice=sc.nextInt();
				switch(choice)
				{
					case 1:			
						Accept();
						SumOfDigit(num);
						break;
						
					case 2:
						Accept();
						Prime(num);
						break;
						
					case 3:
						System.out.print("Enter lenght of series=");
						num=sc.nextInt();
						fibonacci(num);
						break;
					case 4:
						System.exit(0);
					default:
						System.out.println("Enter valid choice only");
				}
			}while(true);
		}
		public void Accept()
		{
			System.out.print("Enter number=");
			num=sc.nextInt();
		}
		public void SumOfDigit(int num)  // Sum of digit function
		{
			int sum=0,lastDigit;
			while(num!=0)
			{
				lastDigit=num%10;
				sum+=lastDigit;
				num/=10;
			}
			System.out.println("Sum of digit="+sum);
		}
		public void Prime(int num) // Prime number function
		{
			int i;
			boolean flag=true;
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("Number is prime");
			else
				System.out.println("Number is not prime");
		}
		public void fibonacci(int num) // Fibonacci series function
		{
			int first=0,second=1,next,i;
			System.out.print(first+" "+second+" ");
			for(i=2;i<num;i++)
			{
				next=first+second;
				first=second;
				second=next;
				System.out.print(next+" ");
			}
		}
		public static void main(String[] args) 
		{
			Task1 obj=new Task1(); // Object creation
			obj.User_choice();
		}
	}


