package Multi_level_inheritance;

public class User_bank extends Staff_bank
{
	public void Bank_Operation()
	{
		int user_choice;
		char next_opt;
		System.out.println("1.seposit\n2.withhdraw\n3.balance check \n4.any bank operation\n5.view your details");
		user_choice=sc.nextInt();
		switch(user_choice)
		{
			case 1:
				depo_Process();
				break;
			case 2:
				with_process();
				break;
			case 3:
				main_balance();
				break;
			case 4:
				cus_supp();
				break;
			case 5:
				account_user_display();
				break;
			default:
				System.out.println("Invalid choice");
				break;		
		}
		System.out.println("want to select any other operation Y/N");
		next_opt=sc.next().charAt(0);
		while(next_opt=='Y' || next_opt=='y');
		System.out.println("thanks for visiting bank of maharashtra");
	}

}
