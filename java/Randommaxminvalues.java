import java.util.Random;

	class Randommaxminvalues{
	
	public static void main(String args[])
	{
	Random random = new Random();

	int max =1024;

	int min =5;

	int result = random.nextInt(max + 1 - min) + min;
	
	System.out.println("Minimum: "+min);
	
	System.out.println("maximum: "+max);  
	

	}

}
