package java_interface;

import java.util.Scanner;

public class rectangle implements interface1
{
	public void area()
	{
		int l,b,area_rect;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter youe length:");
		l=sc.nextInt();
		System.out.println("enter youe breadth:");
		b=sc.nextInt();
		area_rect=l*b;
		System.out.println(area_rect);
		sc.close();
	}
}
