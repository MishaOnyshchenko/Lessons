/**
 * Created by java on 09.01.2018.
 */
public class Dog {

    private boolean isHungry;
    public String name;
    private int foots;

    public boolean isHungry() {
        return isHungry;
    }
    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFoots() {
        return foots;
    }
    public void setFoots(int foots) {
        this.foots = foots;
    }
}
