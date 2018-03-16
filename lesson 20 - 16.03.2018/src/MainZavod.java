import java.util.*;


public class MainZavod {

    public static void main(String[] args) {

//        Employee em1 = new Employee("Ivan", 24);
//        Employee em2 = new Employee("Bogan", 34);
//        Employee em3 = new Employee("Baran", 44);
//
//
//        HashSet <Employee> employee = new HashSet<>();
//
//        employee.add(em1);
//        employee.add(em2);
//        employee.add(em3);
//
//        HashMap<String, Employee> hashMap = new HashMap<>();
//        hashMap.put("001", em1);
//        hashMap.put("002", em2);
//        hashMap.put("003", em3);
//
//        HashSet<String> stringHashSet = new HashSet<>();
//        HashSet<Employee> employeeHashSet = new HashSet<>();
//
//        for (Map.Entry<String, Employee> entry : hashMap.entrySet()) {
//            String key = entry.getKey();
//            Employee em = entry.getValue();
//        }
//
//        Set<String> keys = hashMap.keySet();
//        keys.forEach(s -> System.out.println(s));
//
//        Collection<Employee> emp = hashMap.values();
//
//        for (Employee em : emp) {
//            System.out.println(em);
//        }

//        Pair<Employee> stringPair = new Pair<>();
//
//        stringPair.setFirst(new Employee("Dave", 25));
//        stringPair.setFirst(new Employee("David", 125));


//        Employee employee = new Employee("David", 15);
//        Employee employee2 = new Employee("Dave", 125);

        Pair<Employee> stringPair = new Pair<>();
        stringPair.setFirst(new Employee("Ivan", 22));
        System.out.println(stringPair.getFirst());

    }
}