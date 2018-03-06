package factory;

import java.util.ArrayList;

public class MainFactory {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Manager("Vasyl",3));
        employees.add(new Manager("Kiryll",4));
        employees.add(new Worker("Fasyl",5));
        employees.add(new Worker("Basyl",6));


        System.out.println(employees.isEmpty());

        for (Employee employee : employees) {
            System.out.print(employee.getName() + " " +
            employee.getYear() + " " + employee.getClass().getSimpleName() +
            " " + employee.doSalary());

            if (employee instanceof Worker){
                System.out.print(" I'm a worker ");
            }
            else{
                System.out.print (" I'm a manager ");
            }
            System.out.println(employee.getName());

        }



    }
}
