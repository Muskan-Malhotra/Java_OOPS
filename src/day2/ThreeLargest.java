package day2;
import java.util.*;

public class ThreeLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=-1,n2=-1,n3=-1;
		Scanner scn = new Scanner(System.in);
		
		if(scn.hasNextInt()) {  //coz this is conditional so compiler will throw error.
			
			n1 = scn.nextInt();
		}
		else {
			System.out.println("should be an integer");
		}
		
		if(scn.hasNextInt()) {
			n2 = scn.nextInt();
		}
		if(scn.hasNextInt()) {
			n3 = scn.nextInt();
		}
		
//		if(n1>n2) {
//			if(n1>n3) {
//				
//			}
//			else {
//				
//			}
//		}
//		else {
//			
//		}
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		scn.close();
	}

}


/**
 * 
 * 
 * package langfundamental;
 
import java.util.Scanner;
 
public class SumFirstFive {
 
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int seed = sc.nextInt();
        int sum = sumFirstFive(seed);
        System.out.println("final sum:="+sum);

        sc.close();

        }



    static int sumFirstFive(int seed)
    {

        int sum =0;
        int ct=0;
        int i=seed; //10

        while(ct<5)
        {

          System.out.println("seed="+seed);    
          sum +=seed; //10
          System.out.println("sum="+sum);    
          seed++;  

          ct++;
        }





        return sum;
    }
 
      
 
}
*/
