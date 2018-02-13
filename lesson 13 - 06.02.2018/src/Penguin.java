
public class Penguin extends Bird implements Fly, CreateEggs {
    @Override
    public void sound() {
        System.out.println("Penguin say: gui gui");
    }

    @Override
    public void createEggs() {
        System.out.println("I like sit on the eggs!");

    }

    @Override
    public void fly() {

    }
}
