import java.util.*;
class SwitchCase {
public static void main(String args[]){

System.out.println("Enter Your age");

Scanner sc = new Scanner(System.in);
int age = sc.nextInt();

	
switch(age){
		
	case 18:
		System.out.println("Now you are adult");
		break;
	case 25:
		System.out.println("Now you are able to get job");
		break;
	case 45:
		System.out.println("Now you are retaired!");
		break;
	default:
		System.out.println("Enjoy your life");
}
	}
		}