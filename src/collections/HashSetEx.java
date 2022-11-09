package collections;

import java.util.ArrayList;
import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {


        HashSet<Employee1> st = new HashSet<Employee1>();

        Employee1 e1 = new Employee1(2,"Raj Malhotra",25000,10); //101

        st.add(e1);

        Employee1 e = new Employee1(1,"Anubhav Sinha",15000,10); //102 hashcode

        st.add(e);

        st.add(new Employee1(3,"Sangeeta Shah",35000,10)); //103
        st.add(new Employee1(2,"Raj Malhotra",25000,10)); //104
        
        //sarre differnt buckets mein chale gye or equals ne duplicacy dikhayi hi nhi.
         
        System.out.println(st);
        System.out.println(st.size());
    }

}

/**
 * package collections;
import java.util.*;
 
public class HashSetEx {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Set<Employee> st = new HashSet<Employee>();

        Employee e1 = new Employee(2,"Raj Malhotra",25000,10);

        st.add(e1);

        Employee e = new Employee(1,"Anubhav Sinha",15000,10);

        st.add(e);

        st.add(new Employee(3,"Sangeeta Shah",35000,20));
        st.add(new Employee(2,"Raj Malhotra",25000,10));


        System.out.println(st);
        System.out.println(st.size());


 
    }
 
}
*/
