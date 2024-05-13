package conditional_statement;
import java.util.Scanner;
public class job_of_fresher {

	public static void main(String[] args) 
	{
		char choice;
		int interview_cat;
		Scanner sc=new Scanner(System.in);
		System.out.println("1) fresher \n2) expert");
		interview_cat=sc.nextInt();
		if(interview_cat==1)
		{
			System.out.println("the company will decide the job of fresher");
		}
		else
			System.out.println("choice your profile \n j:java developer i:.net developer \n");
			choice=sc.next().charAt(0);
			if(choice=='j')
			{
				System.out.println("you have selected for java developer");
			}
			else
			{
				System.out.println("you have selected for .net developer");
			}

	}

}
