package factory;

public  class Employee {

    private String name;
    private int salary;
    private int year;
    private int koef = 1;

    public Employee(String name, int year) {
        this.name = name;
        this.year = year;
    }

   //public abstract int doSalary();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
