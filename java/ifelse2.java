import java.util.Scanner;
class ifelse2{

public static void main(String args[]){

Scanner CBSE = new Scanner(System.in);
System.out.println("Enter Your Percentage: ");
float percentage = CBSE.nextFloat();

if(percentage > 100 || percentage < 0){
System.out.println("Invalid Percentage");
}

else if(percentage >= 75){
System.out.println("Distinction");
}

else if(percentage >= 60 && percentage < 75){
System.out.println("First Class");
}
else if(percentage >= 50 && percentage < 60){
System.out.println("Second Class");
}

else if(percentage >= 35 && percentage < 50){
System.out.println("Third Class");
}
else{
System.out.println("Sorry you are Failed");

}
	}
		}