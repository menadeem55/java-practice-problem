import java.util.*;

class `{

        public static void main(String args[])
        {
                Scanner scan = new Scanner(System.in);
               
               
                 System.out.println("Enter the number: ");
                 
                int n = scan.nextInt();
               
                if(n > 0)
                  System.out.println(n+" is Positive");
                else if(n < 0)
                   System.out.println(n+" is Negative");
                else
                   System.out.println(n+" is Zero");
               
       
        }


}