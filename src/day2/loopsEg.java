package day2;
import java.util.*;

public class loopsEg {

	public loopsEg() {
		// TODO Auto-generated constructor stub
		Scanner scn = new Scanner(System.in);
		int no1 = scn.nextInt();
		int no2 = scn.nextInt();
		int no3 = scn.nextInt();
		
		if(no1>no2 && no1>no3) {
			System.out.println("no1 is greatest");
		}
		else if(no2>no1 && no2>no3) {
			System.out.println("no2 is greatest");
		}
		else {
			System.out.println("no3 is greater");
		}
		
		scn.close();
		
	}
	

}
