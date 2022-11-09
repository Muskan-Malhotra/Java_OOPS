package collections;

import java.util.PriorityQueue;
import java.util.Queue;

import collections.Employee2;

public class PracQu{
	
	public static void main(String[] args) {
		
		Queue<Employee2> qs = new PriorityQueue<Employee2>();
		
		qs.add(new Employee2(1,"Anubhav Sinha",15000,10));
		System.out.println(qs);
	}

}
