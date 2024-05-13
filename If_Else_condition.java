package conditional_statement;
import java.util.Scanner;
public class If_Else_condition 
{
	public static void main(String [] args)
	{
		int number;
		int square=0; //initialization if square
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		//use is condition
		if(number>0 && number<20)
		{
			square=number*number;
			System.out.println("the result is:"+square);
		}
		else
		{
			System.out.println("kindly enter positive number less than 20");
		}
		
	}

}
