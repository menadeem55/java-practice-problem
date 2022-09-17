import java.util.Scanner;
class Vowel{

	public static void main(String args[] )
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter chracter:  ");
		char ch = scanner.next().charAt(0);

		switch(ch)
		{
			case 'A' :  System.out.println("A");
					  break;
			case 'E' :  System.out.println("E");
					  break;
			case 'I' :  System.out.println("I");
					  break;
			case 'O' :  System.out.println("O");
					  break;
			case 'U' :  System.out.println("U");
					  break;
			
			default : System.out.println("Not an vowel");
		}
	
	}

}