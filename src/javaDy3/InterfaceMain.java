package javaDy3;
import java.util.Scanner;

public class InterfaceMain {
	
	public static void main(String[] args) {
		Bouncable b;
		Rollable rref;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter color for ball");
		
		String c = scn.next();
		
//		b = new  Ball(c);
		
		System.out.println("Enter bounce factor multiple for ball");
		
		int bmultiple  = scn.nextInt();
		
		System.out.println("Enter roll factor multiple for ball");
		
		int rmultiple  = scn.nextInt();
		
//		meth(b,multiple);
		meth(new Ball(c),bmultiple);
		meth1(new Ball(c),10);
		
		scn.close();
	}
	
	public static void meth(Bouncable b, int multiple) {
		
		b.setBounceMutltiple(multiple);
		b.bounce();
		((Ball)b).roll();
		
	}
	
	public static void meth1(Rollable r,int multiple) {
		
		r.setRollMultiple(multiple);
		r.roll();
		
	}
}


/**
 * //this will also work the same way!!
public static void main(String[] args) {
//	Bouncable b;
	
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter color for ball");
	
	String c = scn.next();
	
	Ball b = new Ball(c);
	System.out.println("Enter bounce factor multiple for ball");
	
	int multiple  = scn.nextInt();
	
	meth(b,multiple);
	scn.close();
}

public static void meth(Ball b, int multiple) {
	
	b.setBounceMutltiple(multiple);
	b.bounce();
	
}
*/
