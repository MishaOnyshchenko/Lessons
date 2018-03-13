package factory;

import java.util.ArrayList;
import java.util.*;

public class MainFactory {

    public static void main(String[] args) {

//        HashSet<Employee> stringHashSet = new HashSet<>();
//        stringHashSet.add(new Employee ("Ivan", 25));
//        stringHashSet.add(new Employee ("Bogan", 35));
//        stringHashSet.add(new Employee ("Kaban", 45));
//
//        for (Employee s : stringHashSet){
//            System.out.println(s.getName()
//            + " - " +s.hashCode());
//        }

        Set <Employee> employers = new TreeSet<>();
        employers.add(new Employee ("Ivan", 25));
        employers.add(new Employee ("Bogan", 35));
        employers.add(new Employee ("Kaban", 45));



//        for (Employee e : employers) {
//            System.out.println(e);
//        }

    }
}
