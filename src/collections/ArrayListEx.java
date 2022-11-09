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
		
		/**
		 * package collections;
//import classesobjects.Employee;
import java.util.*;
 
public class ArrayListEmployee {
 
    public static void main(String[] args) {


        List<Employee> lst = new ArrayList<Employee>();  //generic-type

        Employee e1 = new Employee(2,"Raj Malhotra",25000,10);

        lst.add(e1);

        Employee e = new Employee(1,"Anubhav Sinha",15000,10);

        lst.add(e);

        lst.add(new Employee(3,"Sangeeta Shah",35000,10));
        lst.add(new Employee(2,"Raj Malhotra",25000,10));


        System.out.println(lst);

        System.out.println(lst.size());      


        /*
         * contains method checks if element is present by comparing it with every element in collection
         * it uses equals method for comparison. 
         * so you have to override equals method in the elements class if two elements are supposed to
         * be equal i.e. meaningfully same application-wise
         * 
         * reason:- why you should override the equals method.
         * if you dont override equals in Employee then Object class equal will be called
         * and it checks if two objects are memory-wise equal - so u wont get the expected result.
         */
/**
          System.out.println("calling contains method on ArrayList to search an Employee:");
          boolean isPresent = lst.contains(new Employee(3,"Sangeeta Shah",35000,10));
          System.out.println("Employee with empid 3 and name Sangeeta Shah is Present or not? = "+isPresent);



          System.out.println("Iterate through list of employees");

          Iterator<Employee> itr = lst.iterator();

          while(itr.hasNext())
          {
              Employee ex = itr.next();
              System.out.println(ex.calcAnnSal());
              System.out.println(ex);
          }



          System.out.println("Printing Employees of ArrayList using forEach method added in java 8");
          lst.forEach(ex-> 
                {
                   System.out.println(ex);
                    double sal  = ex.calcAnnSal();     
                    System.out.println(sal);


                }

            );


          lst.forEach(ex-> System.out.println(ex));

          System.out.println("isempty:"+lst.isEmpty());
          lst.clear();
          System.out.println("isempty:"+lst.isEmpty());



    }
 
    

}
		 */
		
		
		
	}

}
