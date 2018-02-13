package components;

/**
 * Created by java on 02.02.2018.
 */
public class Hand {

    private String typeHand;

    public String getTypeHand() {
        return typeHand;
    }

    public void setTypeHand(String typeHand) {
        this.typeHand = typeHand;
    }

    public Hand(String typeHand) {
        this.typeHand = typeHand;
    }

    public void robotCanWrite(){
        System.out.println("I have " + typeHand + " hand and I can write!");
    }
}
