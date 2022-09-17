import java.util.*;
class ScannerDemo2{

	public static void main(String args[])
	{
		Scanner object = new Scanner(System.in);
		
		System.out.println("Enter Your mobile Number: ");
		
		long mobilenum = object.nextLong();
		
		System.out.println("Are you Single ?");

		char single = object.next().charAt(0);
		
		System.out.println("Are You Married ?");
	
		boolean isMarried = object.nextBoolean();

		System.out.println("Your Mobile: "+mobilenum);
		System.out.println("single ?: "+single);
		System.out.println("Married ?: "+isMarried);
	}
			}