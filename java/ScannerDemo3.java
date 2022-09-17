import java.util.*;
class ScannerDemo3{

	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter your email:");

	String emailId = scan.next();

	System.out.println("Enter your age:");

	int age = scan.nextInt();
	
	System.out.println("Enter your salary:");

	double salary = scan.nextDouble();

	System.out.println("Are you Single?");

	char single = scan.next().charAt(0);

	System.out.println("Married?");
	boolean isMarried = scan.nextBoolean();

	System.out.println("Your email: "+emailId);
	System.out.println("Your age: "+age);
	System.out.println("Single ?: "+single);
	System.out.println("Married? "+isMarried);
	System.out.println("Your salary: "+salary);


	}
}
