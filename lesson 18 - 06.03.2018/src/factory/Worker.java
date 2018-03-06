package factory;

public class Worker extends Employee{

    private int salary = 500;

    public Worker(String name, int year) {
        super(name, year);
    }


    @Override
    public int doSalary() {
        return 0;
    }
}
