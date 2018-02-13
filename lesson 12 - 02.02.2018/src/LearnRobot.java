import components.Body;
import components.Hand;
import components.Head;
import components.Leg;

/**
 * Created by java on 02.02.2018.
 */
public class LearnRobot extends Robot {
    private String superLearn;

    public LearnRobot(Head head, Body body, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg, String superLearn) {
        super(head, body, leftHand, rightHand, leftLeg, rightLeg);
        this.superLearn = superLearn;
    }

    public String getSuperLearn() {
        return superLearn;
    }

    public void setSuperLearn(String superLearn) {
        this.superLearn = superLearn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LearnRobot that = (LearnRobot) o;

        return !(superLearn != null ? !superLearn.equals(that.superLearn) : that.superLearn != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (superLearn != null ? superLearn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LearnRobot{} " + super.toString();
    }
}
