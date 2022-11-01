package langfundamentals;

public class Employee {
	
	int empid;
	static int ct=0;
	
	public Employee(int id) {
		empid=id;
		ct = ct+1;
		sysout("ct="+ct);
	}
	
	static void showObjectCount() {
		System.out.println("No of employess obj:"+ct);
	}
	
	void display() {
		System.out.println("id="+empid);
	}

}
