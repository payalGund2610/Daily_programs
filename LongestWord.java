//Have thefunction LongestWord(sen) take the sen parameter being passed and
//return the longest word in the string.
//If there are two or more words that are the same length, 
//return the first word from the string with that length.
//Ignore punctuation and assume sen will not be empty. 
//Words may also contain numbers, for example "Hello world123 567"

package Interview_Questions;
import java.util.Scanner;


public class LongestWord 
{
	public void Longest_word()
	{
		String sentance,str1="",longest="";
		int i,count=0,max=1;
		char str;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Entre Your Sentence: ");
		sentance=input.nextLine();
		input.close();
		
		for(i=0;i<sentance.length();i++)
		{
			str=sentance.charAt(i);  // slipt the sentance into single character
			if(str==32 || str=='\0')
			{
				if(max<count) // check the word count with max count
				{
					longest="";
					max=count;
					longest=str1;
				}
				// make count and word empty
				str1="";
				count=0;
			}
			else
			{
				// count the length and store the word
				count++;
				str1+=str;
			}
		}
		System.out.println("Longest Word is:"+longest);
		System.out.println("Lenght of word is : "+max);
	}
	public static void main(String[] args) 
	{
		LongestWord obj=new LongestWord();
		obj.Longest_word();
	}
}
