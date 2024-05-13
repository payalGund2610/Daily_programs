//write a program to accept the value form user if number is positive the calculate the square.
package conditional_statement;
import java.util.*;
public class If_condition 
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
		}
		System.out.println("the result is:"+square);
	}

}
