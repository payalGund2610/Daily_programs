package looping_statement;
import java.util.Scanner;
public class startpoint_endpoint
{
	public static void main(String [] args)
	{
		int i,start_point,end_point;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start point:");
		start_point=sc.nextInt();
		System.out.println("enter end point:");
		end_point=sc.nextInt();
		for(i=start_point;i<=end_point;i++)
		{
			System.out.println(i);
		}
	}
}
