package functionalInterface;

import java.util.function.Function;

public class checkPrimeFunctionalInterface {
	
	public static void main(String[] args) {
		Function<Integer,Boolean> f = (no)->
		{
			if(no<=0) {
				return false;
			}
			else if(no>0 && no<=2) {
				return true;
			}
			else {
				for(int i=2;i<no;i++) {
					if(no%i==0) {
						return false;
					}
				}
			}
			
			return true;
		};
//		function t,r --> t is the argument and r is the return value
		System.out.println(f.apply(9));
		System.out.println(f.apply(19));
		
		meth(f=(no)->
		{
			if(no<=0) {
				return false;
			}
			else if(no>0 && no<=2) {
				return true;
			}
			else {
				for(int i=2;i<no;i++) {
					if(no%i==0) {
						return false;
					}
				}
			}
			return true;
		});
		
	}
	
	static void meth(Function<Integer,Boolean> f) {
		System.out.println(f.apply(9));
		System.out.println(f.apply(19));
		
		//some implementation of function interface
		//Labda se override karenge...
	}

}
