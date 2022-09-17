import java.util.Scanner;

class Calculator1{

	static int add(int n1,int n2)
	{
		return n1 + n2;
	}

	static int sub(int num1,int num2)
	{
		return num1 - num2;
	}
	static int mul(int num1,int num2)
	{
		return num1 * num2;
	}
	static int div(int num1 , int num2)
	{
		return num1 / num2;
	}
	

	public static void main(String args[])
	{

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your choice: ");
	System.out.println("Press\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division");


	int choice = scan.nextInt();
	System.out.println("Enter num1: ");
	
	int num1 = scan.nextInt();
	System.out.println("Enter num2: ");
	int num2 = scan.nextInt();

	switch(choice)

	{
		case 1 :
			System.out.println("Sum is: "+add(num1,num2));
			break;
		case 2 :
			System.out.println("Sum is: "+sub(num1,num2));
			break;
		case 3 :
			System.out.println("Sum is: "+mul(num1,num2));
			break;
		case 4 :
			System.out.println("Sum is: "+div(num1,num2));
			break;

		default: 

			System.out.println("Invalid Choice");
			}
		}
	}
