package collections;
import java.util.*;

//import com.sun.jdi.Method;

public class ArrayListEx {
	
	public static void main(String[] args) {
		//concrete ArrayList class
//		List lst = new ArrayList();
		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(100);  //new Integer(100) --> autoboxing --> box the primitive to obj type;
		lst.add(80);
		lst.add(30);
		lst.add(10);
		
		
		System.out.println(lst); //lst.toString()  -- tostring() bhi arraylist se call hoga
		//Interface hai List toh arraylist ke refrence se call hoga jo implement karta hai
		
//		packagename.classname@hashcode value yeh tostring method batata hai
//		Arraylist wallon ne overide kiya hai tostring Method.class
		
//		tostring method mein implementatin hai
		
		int no = (int)lst.get(0); //to get the primitive value from the obj value
		//new Integer(100).intValue() -- auto-boxing - unbox Integer obj to primitiver
		
		System.out.println("value at index position 0");
		// int n = lst.get(0); //not possible cox abhi type mentioned nhi hai!!
		//class cast exception not thrown now
		// int n = lst.get(0); //not possible cox abhi type mentioned nhi hai!!
		
		
		
		
		
	}

}
