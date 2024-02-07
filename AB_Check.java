//Have the function ABCheck(str) take the str parameter being passed and 
//return the string true if the characters a and b 
//are separated by exactly 3 places anywhere in the string at least once 
//(ie. "lane borrowed" would result in true because
//there is exactly three characters between a and b). 
//Otherwise return the string false.
package Interview_Questions;

import java.util.Scanner;

public class AB_Check
{
	int i;
	String str;
	Scanner sc = new Scanner(System.in);
	public boolean ABCheck()
	{
		System.out.println("Enter Your Stirng:");
		str=sc.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'a')
			{
				if(i + 4 <str.length() && str.charAt(i + 4) == 'b')
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		AB_Check obj = new AB_Check();
		System.out.println(obj.ABCheck());
	}
}

