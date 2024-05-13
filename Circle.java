package java_interface;

import java.util.Scanner;

public class Circle implements interface1
{
	public void area()
	{
		int radious;
		double area_circle,pi=3.14;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Value of r:");
		radious=sc.nextInt();
		area_circle=pi*radious*radious;
		System.out.println(area_circle);
		sc.close();
	}
}
