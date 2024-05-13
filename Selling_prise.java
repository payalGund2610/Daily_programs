package Basic;

import java.util.Scanner;

public class Selling_prise 
{
	public static void main(String[] args) 
	{
		int cp,sp,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter selling price:");
		sp=sc.nextInt();
		System.out.println("Enter cost price:");
		cp=sc.nextInt();
		
		result=sp-cp;
		if(result>0)
		{
			System.out.println("the profit is:"+result);
		}
		else
		{
			System.out.println("is is loss "+(-result));
		}

	}

}
