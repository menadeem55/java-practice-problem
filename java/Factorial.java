import java.util.*;
class Factorial
{
  public static void main(String args[])
  {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number and get its Factorial: ");
	int num = scan.nextInt();
	int fact=1;
	for(int i=num; i>1; i--)
	{
		fact= fact * i;
		
	}
	System.out.println("Factorial of "+num+" is "+fact);
  }
}