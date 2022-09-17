import java.util.Random;

class GamblingGame1{

public static void main(String args[])
{
	Random random = new Random();
	
	int money = 100;
	
	int playCount = 0;
	int wonCount = 0;
	
	while(money !=200 && money!=0)
	{
		playCount++;
	
	System.out.println("Initial Money: "+money);
	
	 int bet = random.nextInt(2);  // 0 or 1
	 
	 if(bet == 1)
	 {
		money = money + 1;
	    wonCount++;
	 }
	 else
	   money = money - 1;
	   
	   
	System.out.println("Remaining Money: "+money);
	
	}
	
	System.out.println("Number of times played: "+playCount);
	System.out.println("Number of times won: "+wonCount);
	
		System.out.println("Number of times lost: "+(playCount - wonCount));


}

}