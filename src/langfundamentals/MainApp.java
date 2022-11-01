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
		sysout(r.empid);
		
		Employee.showObjectCount();
		Employee s = new Employee(1);
		sysout(s.empid);
		s.dispaly();
		Employee.showObjectCount();
	}

}

