package Robotics;

/**
 * Created by java on 26.01.2018.
 */
public class Robot {

    private String name;
    private int cpu;
    private int serialNumber;

    public void thinking () {

        if (checkOnSerialNumber() == true) {
            if (cpu > 2) {
                System.out.println("I am good thinking");
            } else {
                System.out.println("I'm stupid robot");
            }

        }
    }



    public String getName() {
        System.out.println("It is trans get name");
        return name;
    }
    public void setName(String name) {
        System.out.println("It is trans set name");
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    private boolean checkOnSerialNumber(){

        if(serialNumber != 0){
            return true;
        }
        return false;
    }



}
