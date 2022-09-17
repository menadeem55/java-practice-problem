import java.util.*;

class Prime{

	public static void main(String args[])
	{
	
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the number: ");
		//int num = scan.nextInt();
		
		for(int j=2; j<=100 ; j++)
		{
		
		boolean isPrime= true; // ON
		for(int i=2 ;   i<= j/2 ; i++)
		{
				if(j%i == 0)
				{
					isPrime = false;
					break;
				}
		
		}
		
			if(isPrime == true)
			 System.out.println(j);
		
		
		}
	}
}