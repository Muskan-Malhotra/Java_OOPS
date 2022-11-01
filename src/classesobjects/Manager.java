package classesobjects;

public class Manager extends Employee{
	
	//private properties are still inherited from getter setter.
	
	private int teamSize;
	private String mgrType;
	
	
	
	
	public Manager() {
		super();
		System.out.println("no args/0 argsManager constructor called!");
	}
	
	public Manager(int id, String empname, double salary, int deptno,int teamSize,String mgrType) {
		super(id,empname,salary,deptno);
		
//		System.out.println("Parameterised Employee constuctor");
		this.teamSize = teamSize;
		this.mgrType = mgrType;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	public String getMgrType() {
		return mgrType;
	}


	public void setMgrType(String mgrType) {
		this.mgrType = mgrType;
	}
	
	
	
}
