package looping_statement;

import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) 
	{
		int start_point,end_point;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start point:");
		start_point=sc.nextInt();
		System.out.println("enter end point:");
		end_point=sc.nextInt();
		while(end_point>=start_point)
		{
			System.out.println(start_point++);
		}
	}

}
