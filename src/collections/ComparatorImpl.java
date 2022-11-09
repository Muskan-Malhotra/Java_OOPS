package collections;
 
import java.util.Comparator;
 
public class ComparatorImpl implements Comparator<Employee2> {

    public int compare(Employee2 e1,Employee2 e2)
    {
        System.out.println("comparing e1.salary:"+e1.getSalary()+" and e2.salary:"+e2.getSalary());
        return (int)(e1.getSalary() - e2.getSalary());
    }
 
}
