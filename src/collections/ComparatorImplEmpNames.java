package collections;

import java.util.Comparator;

public class ComparatorImplEmpNames implements Comparator<Employee2>{
	
	
	//in comparator we
	@Override
	public int compare(Employee2 e1 , Employee2 e2) {
		System.out.println("comparing e1.Empname:"+e1.getEmpname()+" and e2.Empname:"+e2.getEmpname());
		return e1.getEmpname().compareTo(e2.getEmpname());
	}

}
