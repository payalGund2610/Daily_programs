package Basic;
import java.util.Scanner;
public class HM_13 {
	public static void main(String [] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("----arithmatic operator-----");
		System.out.println("addition"+(a+b));
		System.out.println("substraction"+(a-b));
		System.out.println("multiplaction"+(a*b));
		System.out.println("division"+(a/b));
		System.out.println("modulous"+(a%b));
		
		System.out.println("------assignment operator-----");
		int d=2;
		System.out.println(d+=2);
		System.out.println(d-=2);
		System.out.println(d*=2);
		System.out.println(d/=2);
		
		System.out.println("------logical operator-----");
		int e=20;
		int f=30;
		boolean g,x;
		g=(e<f)&&(f>e);
		x=(e>f)||(f>e);
		System.out.println(g);
		System.out.println(x);
		
		System.out.println("-----comparision operator-------");
		int h=20,i=20;
		boolean z;
		z=(h>i);
		System.out.println(z);
		
	}

}
