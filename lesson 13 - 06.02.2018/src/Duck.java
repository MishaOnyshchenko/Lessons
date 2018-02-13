
public class Duck extends Bird implements Fly, CreateEggs{


    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void sound() {
        System.out.println("Ga-ga-ga!");
    }

    @Override
    public void createEggs() {
        System.out.println("Iam duck and I loki to create eggs!");
    }
}
