package day2;

public class FunctionCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//member function	
		FunctionCall oc = new FunctionCall();
		oc.greet("Muskan");
		
		//static function
		greet1("Ok@");
		//straight call from inside class.
		//outside class class name with the thing that needs to be called.
		
		

	}
	
	public void greet(String name) {
		System.out.println("Helolo "+name);
	}
	//called this function in sum class:
	public static void greet1(String name) {
		System.out.println("This is static "+name);
	}

}




//package langfundamental;
//
//import java.util.Scanner;
// 
//public class FunctionCall {
// 
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
// 
//        
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter full name:");
//        String name = sc.nextLine();
//
//        //call a member function
//        FunctionCall ob = new FunctionCall();
//        ob.greet(name);
//
//        //calling a static function
//        greet1(name);
//
//        sc.close();
//
//        System.out.println("remaining program continues");
//
//
//    }
//
//
//
//    public void greet(String name)
//    {
//        System.out.println("Hello "+name);
//    }
//
//    public static void greet1(String name)
//    {
//        System.out.println("Hello "+name);
//    }
// 
//}