import java.util.Scanner;
class ifelse1{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Percentage: ");
float percentage = sc.nextFloat();

if(percentage > 100 || percentage < 0){
System.out.println("INVALID PERCENTAGE");
}

else if(percentage >= 75){
System.out.println("DISTINCTION");
}

else if(percentage >= 60 && percentage < 75){
System.out.println("FIRST CLASS");
}

else if(percentage >= 50 && percentage < 60){
System.out.println("SECOND CLASS");
}

else if(percentage >=35 && percentage < 50){
System.out.println("THRID CLASS");
}

else{
System.out.println("SORRY YOU FAILED...!");
}

	}
		}