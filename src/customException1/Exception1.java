package customException1;
import java.util.*;

public class Exception1 {
	
	public static void main(String[] args) {
		
		Account1 acc = new Account1("Steve Jobs",1001, 17000.0);
		Scanner sc = new Scanner(System.in);
        String r;
        
        do
        {
            System.out.println("Enter the amt to withdraw in multiples of 1000:");
            double amt = sc.nextDouble();

            try
            {
            
            	amt = acc.amount(amt);
            }
            catch(ZeroBalanceException e)
            {
            	System.out.println("You have Zero Balance");
                System.out.println(e);
                break;
            }
            catch(NegativeBalanceException e)
            {
            	System.out.println("Withdrawal not possible!!");
                System.out.println(e);
                break;
            }
            System.out.println("Do you wish to continue:(y/n):");
             r =  sc.next();


        }while(r.charAt(0)=='y'||r.charAt(0)=='Y');
 
        
        sc.close();
        System.out.println("program ends here..");
 
		
		
	}

}
