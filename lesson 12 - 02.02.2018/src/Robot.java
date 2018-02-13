import components.Body;
import components.Hand;
import components.Head;
import components.Leg;

/**
 * Created by java on 02.02.2018.
 */
public class Robot {

    private int superpower;

    private Head head;
    private Body body;

    private Hand leftHand;
    private Hand rightHand;

    private Leg leftLeg;
    private Leg rightLeg;

    public Robot() {
    }

    public Robot(Head head, Body body, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg) {
        this.head = head;
        this.body = body;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;

        checkOnRobotPart(head, body,leftHand, rightHand, leftLeg, rightLeg);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Robot robot = (Robot) o;

        if (head != null ? !head.equals(robot.head) : robot.head != null) return false;
        if (body != null ? !body.equals(robot.body) : robot.body != null) return false;
        if (leftHand != null ? !leftHand.equals(robot.leftHand) : robot.leftHand != null) return false;
        if (rightHand != null ? !rightHand.equals(robot.rightHand) : robot.rightHand != null) return false;
        if (leftLeg != null ? !leftLeg.equals(robot.leftLeg) : robot.leftLeg != null) return false;
        return !(rightLeg != null ? !rightLeg.equals(robot.rightLeg) : robot.rightLeg != null);

    }

    @Override
    public int hashCode() {
        int result = head != null ? head.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (leftHand != null ? leftHand.hashCode() : 0);
        result = 31 * result + (rightHand != null ? rightHand.hashCode() : 0);
        result = 31 * result + (leftLeg != null ? leftLeg.hashCode() : 0);
        result = 31 * result + (rightLeg != null ? rightLeg.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head=" + head +
                ", body=" + body +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                '}';
    }

    public void checkOnRobotPart(Head head, Body body, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg){
        int count = 0;
        if (head != null && this.body != null){
            count++;
            head.canThink();
        }
        if(leftHand != null && rightHand != null && this.body != null){
            count++;
            System.out.println("I can write");
            leftHand.robotCanWrite();
        }
        if(leftLeg != null && leftLeg != null&& this.body != null){
            count++;
            leftLeg.robotCanRun();
        }
        if(count == 3){
            System.out.println("Robot is ready!");
        }
    }

}
