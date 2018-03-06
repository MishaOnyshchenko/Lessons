package factory;

public class Manager extends Employee {

    private int salary = 1500;

    public Manager(String name, int year) {
        super(name, year);
    }


    @Override
    public int doSalary() {
        return 0;
    }
}
