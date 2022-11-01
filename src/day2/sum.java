package day2;

public class sum {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		FunctionCall.greet1("This is name form greet1 of the class FunctionCall");
	}

}
