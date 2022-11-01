package classesobjects;

public class ClassesObjectsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is the object refernce of Emplyee Type
		Employee e;    //outside main not accesible.
		
		e=new Employee(1,"Preeti",15000,10);
		//here the constructor values should match.
		
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
		System.out.println(e.getSalary());
		
		//System.out.println("this line won't be visible after the exception");
		//default constructor nikal jayega coz humnein apna constructor provide kar diya hai
		
		Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
		
//		System.out.println(e1.getEmpid());
//		System.out.println(e1.getEmpname());
//		System.out.println(e1.getSalary());
		e1.displayEmp();
		
//		can use e1 again as well and can make it point to new stuffs
		
		
		e1.setSalary(1000);
		e1.displayEmp();
		double annsal= e1.calcAnnSal();
		System.out.println(annsal);
		
		annsal= e1.calcAnnSal(1000);
		System.out.println(annsal);
	
		Employee e3 = new Employee(3,"Paras Joshi",25000,20);
		// cp[u constructor
		System.out.println("Copy constructor");
		Employee e4 = new Employee(e3);
		e4.displayEmp();
		
		System.out.println(e3==e4); //false;  diff memeoery location
		
		//share same values but not the same location.
		
	
		//create a manager object and check the sequence.
		
	
	
	}

}



///** mam ka code
//[12:25 PM] Namrata Marathe (Guest)
//package classesobjects; public class ClassesObjectsApp {​​​​​     public static void main(String[] args) {​​​​​
//
//        Employee e=null; //e is reference of type Employee - object reference
//
//        e = new Employee(1,"Anubhav Sinha",15000,10);         //System.out.println(e);
//
//        /**
//
//        System.out.println(e.getEmpid());
//
//        System.out.println(e.getSalary());
//
//        System.out.println(e.getEmpname());
//
//        */
//
//        e.displayEmp();         
//
//        Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
//
//      /**
//
//        System.out.println(e1.getEmpid());
//
//        System.out.println(e1.getSalary());
//
//        System.out.println(e1.getEmpname());
//
//        */
//
//        e1.displayEmp();         System.out.println("remaining program continues..");     }​​​​​ }​​​​​
//
//*/