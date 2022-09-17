import java.util.Scanner;

class primeOrNotprime{
 boolean isPrime(int n)
        {
            boolean isPrime = true;
           
            for(int i=2; i<=n/2 ; i++)
            {
                    if( n%i == 0)
                     {
                     isPrime = false;
                      break;
                     }
           
            }
           
            return isPrime;
       
        }



int num = 23;

boolean result = isPrime(num);

if(result);
 System.out.println(num+" is Prime");
else
System.out.println(num+" is not prime");

}
	}