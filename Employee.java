package inheritance;

public class Employee extends Programmer
{
	String name,designation,departement;
	int salary;
	public void inforamation()
	{
		System.out.println("Enter Your Name:");
		name= sc.next();
		
		System.out.println("Enter Your designation:");
		designation= sc.next();
		
		System.out.println("Enter Your departement:");
		departement= sc.next();
		
		System.out.println("Enter Your salary:");
		salary= sc.nextInt();
	}
	public void display_employee()
	{
		System.out.println("Name: "+name);
		System.out.println("designation: "+designation);
		System.out.println("departement: "+departement);
		System.out.println("salary: "+salary);
	}
}













