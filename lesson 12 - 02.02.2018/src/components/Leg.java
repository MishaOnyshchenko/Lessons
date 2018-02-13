package components;

/**
 * Created by java on 02.02.2018.
 */
public class Leg {

    private String typeLeg;


    public String getTypeLeg() {
        return typeLeg;
    }

    public void setTypeLeg(String typeLeg) {
        this.typeLeg = typeLeg;
    }

    public Leg(String typeLeg) {
        this.typeLeg = typeLeg;
    }

    public void robotCanRun(){
        System.out.println("I have " + typeLeg + " leg and I can run!");
    }
}
