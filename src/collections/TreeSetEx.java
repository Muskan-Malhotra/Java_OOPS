package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String[] args) {
	
		SortedSet<String> sortset = new TreeSet<String>();
		
		sortset.add("Vivek");
		sortset.add("Aditya");
		sortset.add("Anusha");
		sortset.add("Priyanka");
		sortset.add("Yamini");
		
		System.out.println(sortset);
		
		sortset.add("Chinmay");
		System.out.println(sortset);
		System.out.println(sortset.size());
		
		Employee2 e1 = new Employee2(2,"Raj Malhotra",25000,10);

		SortedSet<Employee2> sst = new TreeSet<Employee2>();
		
        sst.add(e1);

        Employee2 e = new Employee2(1,"Anubhav Sinha",15000,10);

        sst.add(e);

        sst.add(new Employee2(6,"Sangeeta Shah",35000,20));
        sst.add(new Employee2(2,"Raj Malhotra",25000,10)); //duplicate



	    System.out.println(sst);
	
	
	    sst.add(new Employee2(4,"Amit Shah",45000,20));
	
	    System.out.println(sst);
	
	    System.out.println(sst.size());
	
	    System.out.println(sst.contains(new Employee2(6,"Sangeeta Shah",35000,20)));
	
	}

}
