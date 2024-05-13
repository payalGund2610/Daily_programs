package Multi_level_inheritance;

public class Staff_bank extends Bank 
{
	String name,mail_id,pan_no;
	int type_account,choice;
	int age,phone_no,adhar_no;
	public void cus_supp()
	{
		System.out.println("1:for new account creation\n 2.any kind of help");
		choice=sc.nextInt();
		if(choice==1)
		{
			new_account_create();
			System.out.println("account created successfully");
		}
		else
		{
			call_support();
		}
	}
	public void call_support()
	{
		System.out.println("you can contact by call ,email or meassage any kind of support ");
	}
	public void new_account_create()
	{
		System.out.println("Enter Your Name:");
		name=sc.next();
		System.out.println("Type of Account \n1.major \n2.minor");
		type_account=sc.nextInt();
		switch(type_account)
		{
			case 1:
				System.out.println("Enter Your Pan_no:");
				pan_no=sc.next();
				System.out.println("Enter Initial amount to create account:");
				balance=sc.nextInt();
				break;
			case 2:
				System.out.println("zero balance account will created.");
				break;
			default:
				System.out.println("invalid choice");
				break;
		}
		System.out.println("Enter Your age:");
		age=sc.nextInt();
		System.out.println("Enter Your Adhar_no:");
		adhar_no=sc.nextInt();
	}
	public void account_user_display()
	{
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Adhar_no"+adhar_no);
				switch(type_account)
				{
				case 1:
					System.out.println("pan no:"+pan_no);
					
					break;
				}
		System.out.println("account balance"+balance);
	}

}

























