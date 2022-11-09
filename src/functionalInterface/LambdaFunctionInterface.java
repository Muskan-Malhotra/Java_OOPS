package functionalInterface;

interface Addable{
	int add(int a, int b);
	
}
public class LambdaFunctionInterface {
	public static void main(String[] args) {
		Addable ob = new Calculator();
		int r = ob.add(10,20);
		System.out.println(r);
		meth(ob);
		
		//or on fly --> meth(new Calculator());
		Addable ob1 = (a,b) -> a+b;
		r = ob1.add(100, 120);
		System.out.println("results:")
	}
	
	static void meth(Addable ob) {
		int r = ob.add(10,20);
		System.out.println(r);
	}
}



//before java8
/*
class claculator implements Addable{
	//then overide it
	
	public int add(int a,int b) {
		return a+b;
	}
}

*/

//now using lambda expression we don't need to create the same class.'