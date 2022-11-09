/**
 * 
 */
package langfundamentals;

/**
 * @author V4SWHVY
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Employee r = new Employee(5);
		System.out.println(r.empid);
		
		Employee.showObjectCount();
		Employee s = new Employee(1);
		System.out.println(s.empid);
		s.display();
		Employee.showObjectCount();
	}

}

