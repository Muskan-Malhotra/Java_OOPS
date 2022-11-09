package collections;

public class Employee2 implements Comparable<Employee2>{
	
	private int empid;
    private String empname;
    private double salary;
    private int deptno;




    public Employee2() {

        //System.out.println("no-args/0-args Employee constructor called");


        /*
        this.empid=11;
        this.deptno=10;
        this.empname="xyz";
        this.salary=100;
        */
    } 

    public Employee2(Employee2 x)
    {
        this.deptno = x.deptno;
        this.empid = x.empid;
        this.empname = x.empname;
        this.salary = x.salary;

    }


    public Employee2(int empid, String empname, double salary, int deptno) {
        //super();
        //System.out.println("Parameterized Employee constructor called..");
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
        this.deptno = deptno;


    }





    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {

        if(salary > 0)
        {
          this.salary = salary;
        }
        else
        {
            System.out.println("Slary can't be 0 or less than 0");
        }
    }
    public int getDeptno() {
        return deptno;
    }
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
    public int getEmpid() {
        return empid;
    }


    public void display()
    {
        //this
        System.out.println("details:"+this.empid+","+this.empname+","+this.salary+","+this.deptno);
        //System.out.println(empid+","+this.empname+","+this.salary+","+this.deptno);


    }


    @Override
    public String toString()
    {
        return "details:"+this.empid+","+this.empname+","+this.salary+","+this.deptno;
    }


    public double calcAnnSal()
    {
        System.out.println("calculate annual salary of Employee called..");
        return this.salary * 12;
    }

    //function overloading  - static/compile time polymorphism
    public double calcAnnSal(double bonus)
    {
        return (this.salary * 12)+bonus;
    }
 
    private void setEmpid(int empid)
    {
        this.empid=empid;
    }



    //e1.equals(e2)

    @Override
    public boolean equals(Object obj)  //obj = e2
    {

        System.out.println("emp's equal method:comparing empid="+this.empid+"and empid="+((Employee2)obj).empid);
        if(obj instanceof Employee2)
          return this.empid == ((Employee2)obj).empid;
        else
          return false;
    }


    @Override
    public int hashCode()
    {
        System.out.println("hashCode of this employee with empid:"+this.empid+" is :"+this.deptno);
        return this.deptno;
    }
    
    @Override
    public int compareTo(Employee2 e) {
    	System.out.println("Compareto of this employee with empid:"+this.empid+" is :"+e.empid);
    	return this.empid-e.empid;
    }

}


/**
 * package collections;
 
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
 
public class TreeSetEmpEx {
 
    public static void main(String[] args) {
        SortedSet<Employee> sst = new TreeSet<Employee>();

          Employee e1 = new Employee(2,"Raj Malhotra",25000,10);

            sst.add(e1);

            Employee e = new Employee(1,"Anubhav Sinha",15000,10);

            sst.add(e);

            sst.add(new Employee(6,"Sangeeta Shah",35000,20));
            sst.add(new Employee(2,"Raj Malhotra",25000,10)); //duplicate



        System.out.println(sst);


        sst.add(new Employee(4,"Amit Shah",45000,20));

        System.out.println(sst);

        System.out.println(sst.size());

        System.out.println(sst.contains(new Employee(6,"Sangeeta Shah",35000,20)));


        //TreeSet that uses Comparator interface

        System.out.println("Using Comparator interface to sort based on employee's salary..");
        Comparator<Employee> c = new ComparatorImpl();

        SortedSet<Employee> sst1 = new TreeSet<Employee>(c);

          Employee e11 = new Employee(2,"Raj Malhotra",25000,10);

          //c.compare(e11,e11)
            sst1.add(e11);

            Employee e12 = new Employee(1,"Anubhav Sinha",15000,10);

         //   c.compare(e11,e12)
            sst1.add(e12);

            sst1.add(new Employee(6,"Sangeeta Shah",35000,20));
            sst1.add(new Employee(2,"Raj Malhotra",25000,10)); //duplicate



        System.out.println(sst1);


        sst1.add(new Employee(4,"Amit Shah",45000,20));

        System.out.println(sst1);

        System.out.println(sst1.size());

        System.out.println(sst1.contains(new Employee(6,"Sangeeta Shah",35000,20)));


    }
 
}

*/
