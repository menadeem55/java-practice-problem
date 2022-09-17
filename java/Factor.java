import java.util.*;
class Factor{

	public static void main(String args[])
	{

	//	Factor : 3 => 3 x 2 x 1

	Scanner scan= new Scanner(System.in);

	int num = scan.nextInt();

		int factorial=1;

		for(int k=num ; k>1; k--)
		{		factorial = factorial * k;

		}

	System.out.println("Factorial is : "+factorial);

	/*	k = 3 factorial = 1
		k = 2 factorial = 3
		k = 1 factorial = 6
		k =	0	factorial = 6
	*/


	}
}