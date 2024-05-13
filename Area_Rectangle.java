package Basic;

import java.util.Scanner;
public class Area_Rectangle 
{
	public static void main(String [] args)
	{
		int length,breadth,area;
		Scanner sc=new Scanner(System.in);
		//aceept length and breadth from your
		System.out.println("enter the length:");
		length=sc.nextInt();
		System.out.println("Enter the breadth:");
		breadth=sc.nextInt();
		//calculate area of rectangle
		area=length *breadth;
		System.out.println("areaof rectange is:"+area);
	}
}
