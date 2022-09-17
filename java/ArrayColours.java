import java.util.*;

class ArrayColours
{
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 colours");
	// String colour[] = sc.next();
	String colour[] = new String[5];
	for(int i=0; i<colour.length; i++)
	{
		colour[i]=sc.next();
	}
	for(int i=0; i<colour.length; i++)
	{
		System.out.println("colour: "+ colour[i]);
	}
	}
}