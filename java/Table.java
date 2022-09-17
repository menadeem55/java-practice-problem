import java.util.*;
class Table{

	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();

		// 2 x 1.............2 x 10 =20

		for(int i =1; i<= 10; i++)
		{

			System.out.println(num + "X" + i+ " = "+(num*i));
			}
		}
}