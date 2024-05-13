// WAP to create a application for food ordering system.
package looping_statement;

import java.util.Scanner;

// do while is a exit control loop

public class Do_while_loop 
{
	public static void main(String[] args) 
	{
		int choice,bill = 0,choice1 = 0,quantity,i=0; //variable initialization
		char answer,item_choice;
		// Use Array
		String[] item=new String[20]; 
		int[] plat=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("**--**--**--**--Welcome to PAYAL'S Hotel--**--**--**--**--**");
		//Use Do While loop for repeating choices in our menu
		do
		{
			//Display main manu's in menu card
			System.out.println("##---##---##---MENU---##---##---##");
			System.out.println("1.Starters\n"+"2.Main Course\n"+"3.Desert\n"+"4.Cold Drink\n"+"5.exit");
			//accept choices form users
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					//Use Do While loop for repeating choices in our menu
					do 
					{
						//Display menu's in Starters 
						System.out.println("Starters Menu\t\t Price");
						System.out.println("1.Masala Finger chips\t 60Rs");
						System.out.println("2.Finger chips \t\t 70Rs");
						System.out.println("3.Paneer crispy \t 170Rs");
						System.out.println("4.Paneer chilly \t 170Rs");
						System.out.println("Enter your choice:");
						choice1=sc.nextInt();
						switch(choice1)
						{
							//accept quantity and calculate bill for each choice in Starters
							case 1:
								System.out.println("Enter The Quantity of Masala finger chips:");
								quantity=sc.nextInt();
								bill+=60*quantity;
								item [i]="Masala finger chips \t 60Rs";
								plat[i]=quantity;
								i++;
								break;
							case 2:
								System.out.println("Enter The Quantity of Finger chips:");
								quantity=sc.nextInt();
								bill+=70*quantity;
								item [i]="Finger chips \t\t 70Rs";
								plat[i]=quantity;
								i++;
								break;
							case 3:
								System.out.println("Enter The Quantity of Paneer Crispy:");
								quantity=sc.nextInt();
								bill+=170*quantity;
								item [i]="Paneer Crispy \t\t 170Rs";
								plat[i]=quantity;
								i++;
								break;
							case 4:
								System.out.println("Enter The Quentity of Paneer Chilly:");
								quantity=sc.nextInt();
								bill+=170*quantity;
								item [i]="Paneer Chilly \t\t 170Rs";
								plat[i]=quantity;
								i++;
								break;
						}
					// asking for more menu in Starters
					System.out.println("Do You Want Add Another Menu In Starters Y/N");
					choice=sc.next().charAt(0);
					}while(choice=='Y' || choice=='y');
					break;
				case 2:
					//Use Do While loop for repeating choices in our menu
					do 
					{
						//Display menu's in Main Course 
						System.out.println("Main Course Menu\t Price");
						System.out.println("1.Dal Makhmi \t\t 150Rs");
						System.out.println("2.Dal Tadka \t\t 120Rs");
						System.out.println("3.Palak paneer \t\t 150Rs");
						System.out.println("4.mutter paneer \t 150Rs");
						System.out.println("Enter your choice:");
						choice1=sc.nextInt();
						switch(choice1)
						{
						//accept quantity and calculate bill for each choice
							case 1:
								System.out.println("Enter The Quentity of Dal Makhmi:");
								quantity=sc.nextInt();
								bill+=150*quantity;
								item [i]="Dal Makhmi \t\t 150Rs";
								plat[i]=quantity;
								i++;
								break;
							case 2:
								System.out.println("Enter The Quentity of Dal Tadka :");
								quantity=sc.nextInt();
								bill+=120*quantity;
								item [i]="Dal Tadka \t\t 120Rs";
								plat[i]=quantity;
								i++;
								break;
							case 3:
								System.out.println("Enter The Quentity of Palak paneer:");
								quantity=sc.nextInt();
								bill+=150*quantity;
								item [i]="Palak paneer \t\t 150Rs";
								plat[i]=quantity;
								i++;
								break;
							case 4:
								System.out.println("Enter The Quentity of Mutter paneer:");
								quantity=sc.nextInt();
								bill+=150*quantity;
								item [i]="Mutter Paneer \t\t 150Rs";
								plat[i]=quantity;
								i++;
								break;
						}
					// asking for more menu in Main course
					System.out.println("Do You Want Add Another Menu In Main Course Y/N");
					choice=sc.next().charAt(0);
					}while(choice=='Y' || choice=='y');
					break;					
				case 3:
					//Use Do While loop for repeating choices in our menu
					do 
					{
						//Display menu's in Desert with price of all item  
						System.out.println("Desert Menu \t\t Price");
						System.out.println("1.Balushahi \t\t 150Rs");
						System.out.println("2.Basoondi \t\t 170Rs");
						System.out.println("3.kesari Rava \t\t 120Rs");
						System.out.println("4.Angoor Rabdi \t\t 130Rs");
						System.out.println("Enter your choice:");
						choice1=sc.nextInt();
						switch(choice1)
						{
						//accept quantity and calculate bill for each choice
							case 1:
								System.out.println("Enter The Quentity of Balushahi:");
								quantity=sc.nextInt();
								bill+=150*quantity;
								item [i]="Balushahi \t\t 150Rs";
								plat[i]=quantity;
								i++;
								break;
							case 2:
								System.out.println("Enter The Quentity of Basoondi :");
								quantity=sc.nextInt();
								bill+=170*quantity;
								item [i]="Basoondi \t 170Rs";
								plat[i]=quantity;
								i++;
								break;
							case 3:
								System.out.println("Enter The Quentity of Kesari Rava :");
								quantity=sc.nextInt();
								bill+=120*quantity;
								item [i]="Kesari Rava \t\t 120Rs";
								plat[i]=quantity;
								i++;
								break;
							case 4:
								System.out.println("Enter The Quentity of Angoor Rabdi:");
								quantity=sc.nextInt();
								bill+=130*quantity;
								item [i]="Angoor Rabdi \t\t 130Rs";
								plat[i]=quantity;
								i++;
								break;
						}
					// asking for more menu in desert
					System.out.println("Do You Want Add Another Menu In Desert Y/N");
					choice=sc.next().charAt(0);
					}while(choice=='Y' || choice=='y');
					break;
				case 4:
					do 
					{
						//Display menu's in Cold Drink with price of all item  
						System.out.println("Cold Drink Menu\t\t Price");
						System.out.println("1.soda \t\t\t 15Rs");
						System.out.println("2.Lemon Soda \t\t 20Rs");
						System.out.println("3.Pachak Soda\t\t 20Rs");
						System.out.println("4.Coca Cola \t\t 20Rs");
						System.out.println("Enter your choice:");
						choice1=sc.nextInt();
						switch(choice1)
						{
						//accept quantity and calculate bill for each choice in Cold Drink 
							case 1:
								System.out.println("Enter The Quentity of Soda :");
								quantity=sc.nextInt();
								bill+=15*quantity;
								item [i]="Soda \t\t\t 15Rs";
								plat[i]=quantity;
								i++;
								break;
							case 2:
								System.out.println("Enter The Quentity of Lemon Soda :");
								quantity=sc.nextInt();
								bill+=20*quantity;
								item [i]="Lemon Soda \t\t 20Rs";
								plat[i]=quantity;
								i++;
								break;
							case 3:
								System.out.println("Enter The Quentity of Pachak Soda:");
								quantity=sc.nextInt();
								bill+=20*quantity;
								item [i]="Pachak Soda\t\t 20Rs";
								plat[i]=quantity;
								i++;
								break;
							case 4:
								System.out.println("Enter The Quentity of Coca Cola :");
								quantity=sc.nextInt();
								bill+=20*quantity;
								item [i]="Coca Cola \t\t 20Rs";
								plat[i]=quantity;
								i++;
								break;
						}
					// asking for more menu in cold drink
					System.out.println("Do You Want Add Another Menu In Cold Drink Y/N");
					choice=sc.next().charAt(0);
					}while(choice=='Y' || choice=='y');
					break;
				default:
					System.out.println("Please Enter Valid Choice.....");
					break;				
			}

			System.out.println("Do You Want Add Another Items Y/N");
			choice=sc.next().charAt(0);
		}
		while(choice=='Y' || choice=='y');
		//Display final bill
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Sr.No \t\t Item Name \t\t Rate \t\tQuentity\n");
		System.out.println("---------------------------------------------------------------------");
		for(int j=0;j<i;j++)
		{
			System.out.println(+(j+1)+" \t\t "+item[j]+" \t\t "+plat[j]);
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Total \t\t\t\t\t  "+bill);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("**__**__**__Thank You  For Comming__**__**__** ");
		sc.close();
	}
		
}


