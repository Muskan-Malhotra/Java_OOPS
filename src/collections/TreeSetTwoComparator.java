package collections;
 
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
 
public class TreeSetTwoComparator {
 
    public static void main(String[] args) {
        SortedSet<Employee2> sst = new TreeSet<Employee2>();

          Employee2 e1 = new Employee2(2,"Raj Malhotra",25000,10);

            sst.add(e1);

            Employee2 e = new Employee2(1,"Anubhav Sinha",15000,10);

            sst.add(e);

            sst.add(new Employee2(6,"Sangeeta Shah",35000,20));
            sst.add(new Employee2(2,"Raj Malhotra",25000,10)); //duplicate



        System.out.println(sst);


        sst.add(new Employee2(4,"Amit Shah",45000,20));

        System.out.println(sst);

        System.out.println(sst.size());

        System.out.println(sst.contains(new Employee2(6,"Sangeeta Shah",35000,20)));




        System.out.println("Using Comparator interface to sort based on employee's salary..");

        /*
        Comparator<Employee> c = new ComparatorImpl();

        meth(c);
        */
        meth(new ComparatorImpl());

        System.out.println("Using Comparator interface to sort based on employee's names..");

        /*
        c = new ComparatorImplEmpNames();

        meth(c);
        */

        meth(new ComparatorImplEmpNames());




    }
 
    
    public static void meth(Comparator<Employee2> c)
    {

        //TreeSet that uses Comparator interface




                SortedSet<Employee2> sst1 = new TreeSet<Employee2>(c);

                  Employee2 e11 = new Employee2(2,"Raj Malhotra",25000,10);

                  //c.compare(e11,e11)
                    sst1.add(e11);

                    Employee2 e12 = new Employee2(1,"Anubhav Sinha",15000,10);

                 //   c.compare(e11,e12)
                    sst1.add(e12);

                    sst1.add(new Employee2(6,"Sangeeta Shah",35000,20));
                    sst1.add(new Employee2(2,"Raj Malhotra",25000,10)); //duplicate



                System.out.println(sst1);


                sst1.add(new Employee2(4,"Amit Shah",45000,20));

                System.out.println(sst1);

                System.out.println(sst1.size());

                System.out.println(sst1.contains(new Employee2(6,"Sangeeta Shah",35000,20)));



    }
}
