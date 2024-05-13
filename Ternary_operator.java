package Basic;
import java.util.Scanner; 
public class Ternary_operator 
{
		public static void main(String[] args) 
		{	
			//------Ternary operator-------
			int num1,num2,result;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First number:");
			num1=sc.nextInt();
			System.out.println("Enter Second number:");
			num2=sc.nextInt();
			
			result=(num1>num2)?num1:num2; //:?operator use
			System.out.println("The Greatest number is "+result);
			
			
		}

	}

