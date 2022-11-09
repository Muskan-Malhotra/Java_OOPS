package collections;
 
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
 
public class TreeMapComparator {
 
    public static void main(String[] args) {


        SortedMap<Employee2,Double> smp = new TreeMap<Employee2,Double>();

        Employee2 e1 = new Employee2(2,"Raj Malhotra",25000,10);

        smp.put(e1,e1.getSalary());

        Employee2 e = new Employee2(1,"Raghav Sinha",15000,10);

        smp.put(e,e.getSalary());


        smp.put (new Employee2(3,"Sangeeta Shah",35000,20),35000.0);
        smp.put(new Employee2(2,"Raj Malhotra",25000,10),25000.0);

        System.out.println(smp);


        //sort employee keys of tree map in ascending order of emp salary

        System.out.println("sort employee keys of tree map in ascending order of emp salary");
        Comparator<Employee2> c = new ComparatorImpl();
        smp = new TreeMap<Employee2,Double>(c);

        Employee2 e11 = new Employee2(2,"Raj Malhotra",25000,10);

        smp.put(e11,e11.getSalary());

        Employee2 ee = new Employee2(1,"Raghav Sinha",15000,10);

        smp.put(ee,ee.getSalary());


        smp.put (new Employee2(3,"Sangeeta Shah",35000,20),35000.0);
        smp.put(new Employee2(2,"Raj Malhotra",25000,10),25000.0);

        System.out.println(smp);

        System.out.println("sort employee keys of tree map in ascending order of emp names");
        Comparator<Employee2> c1 = new ComparatorImplEmpNames();
        meth(c1);





    }

    public static void meth(Comparator<Employee2> c)
    {
         TreeMap<Employee2,Double> smp = new TreeMap<Employee2,Double>(c);

            Employee2 e11 = new Employee2(2,"Raj Malhotra",25000,10);

            smp.put(e11,e11.getSalary());

            Employee2 ee = new Employee2(1,"Raghav Sinha",15000,10);

            smp.put(ee,ee.getSalary());


            smp.put (new Employee2(3,"Sangeeta Shah",35000,20),35000.0);
            smp.put(new Employee2(2,"Raj Malhotra",25000,10),25000.0);

            System.out.println(smp);

    }
 
}
