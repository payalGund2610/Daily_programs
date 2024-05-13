package Basic;
import java.util.*;
public class Bitwise_operator {
	//----14-nov-2023------
		public static void main(String[] args) 
		{	
			//------bitwise operator-------
			int num1,num2,result;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First number:");
			num1=sc.nextInt();
			System.out.println("Enter Second number:");
			num2=sc.nextInt();
			//the operator of bitwise & 
			result=num1&num2;
			System.out.println("The Result of & operator is="+result);
			//the operator of bitwise | 
			result=num1|num2;
			System.out.println("The Result of | operator is="+result);
			//the operator of bitwise ^ 
			//truth table of EOR
			//	1	1=0
			//	0	1=1
			//	1	0=1
			//	0	0=0
			result=num1^num2;
			System.out.println("The Result of ^ operator is="+result);
			
			
		}

	}
