import components.Body;
import components.Hand;
import components.Head;
import components.Leg;

/**
 * Created by java on 02.02.2018.
 */
public class SuperRobot extends Robot {
    private String superPower;

    public SuperRobot(Head head, Body body, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg, String superPower) {
        super(head, body, leftHand, rightHand, leftLeg, rightLeg);
        this.superPower = superPower;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SuperRobot that = (SuperRobot) o;

        return !(superPower != null ? !superPower.equals(that.superPower) : that.superPower != null);

    }

    @Override
    public String toString() {
        return "SuperRobot{" +
                "superPower='" + superPower + '\'' +
                "} " + super.toString();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (superPower != null ? superPower.hashCode() : 0);
        return result;
    }
}
