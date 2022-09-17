import java.util.Scanner;
class Calculator{

	public static void main(String args[] )
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press\n 1. Addition\n 2. Substraction\n 3. Multiplication\n 4. Division\n");
	
		int choice = scanner.nextInt();
		
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		
		// Case statement : Int, String , char 25.9

		switch(choice)
		{
			case 1:  System.out.println(num1 + num2);
					  break;
			case 2:  System.out.println(num1 - num2);
					  break;
			case 3:  System.out.println(num1 * num2);
					  break;
			case 4:  System.out.println(num1 / num2);
					  break;
					  
			default : System.out.println("Invalid Input");
		}
	
	}

}