import java.util.*;

class Power{

	public static void main(String args[])
	{

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = scan.nextInt();

	System.out.println("Enter the power: ");

	int p = scan.nextInt();
	int power=1;

	for( int i=1 ; i<=p ; i++ )
	{
			power = num * power;
	}
	System.out.println("Power is: "+power);

	}
}
