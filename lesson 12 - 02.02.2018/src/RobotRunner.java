import components.*;

public class RobotRunner {
    public static void main(String[] args) {

        Robot robot = new Robot(new Head(), new Body(),new Hand("left"), new Hand ("right"), new Leg("left"), new Leg ("right"));
        SuperRobot superRobot1 = new SuperRobot("superPower");
    }

}
