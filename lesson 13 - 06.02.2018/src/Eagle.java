
public class Eagle extends Bird implements Fly{
    @Override
    public void fly() {
        System.out.println("I am flying in the sky");
    }

    @Override
    public void sound() {
        System.out.println("Eeeeeee");
    }
}
