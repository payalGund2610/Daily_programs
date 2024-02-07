//Have the function LetterChanges(str) take the str parameter being passed 
//and modify it using the following algorithm. 
//Replace every letter in the string with the letter following it in the alphabet
//(ie. c becomes d, z becomes a).
//Then capitalize every vowel in this new string (a, e, i, o, u) and 
//finally return this modified string.

package Interview_Questions;

import java.util.Scanner;

public class LetterChanges
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str;
		
		LetterChanges obj=new LetterChanges();
		
		System.out.println("Enter Your String:");
		str=sc.next();
		
		System.out.println(obj.ChangesCharacter(str));
		
		sc.close();
	}
	public String ChangesCharacter(String str)
	{
		char characters=' ';
		int i;
		for(i=0;i<str.length();i++)
		{
			characters=str.charAt(i);
			
			if(characters=='a'||characters=='e'||characters=='i'||characters=='o'||characters=='u')
			{
				characters=str.charAt(i);
				str=str.replace(characters, (char)(characters-33));
			}
			if(characters=='z')
			{
				str=str.replace('z', 'a');
			}
			else
			{
				characters=str.charAt(i);
				str=str.replace(characters, (char)(characters+1));
			}
		}
		return str;
	}
}
