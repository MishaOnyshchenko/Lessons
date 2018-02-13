package Robotics;


public class RobotRunner {

    public static void main(String[] args) {

//        Robot robot = new Robot();
//
//        robot.thinking();
//        robot.setCpu(3);
//        robot.thinking();

        ChappiRobot chp = new ChappiRobot();

        chp.thinking();

        Transformer transformer = new Transformer();
        transformer.setName("Vasya");
        System.out.println(transformer);


//        transformer.setSerialNumber(12345);
//        transformer.setName("Fighter");
//        transformer.getName();
//
//        transformer.setSword(true);
//
//        transformer.fight();
//
//        System.out.println("-------------------");
//        Simplyrobot simplyrobot = new Simplyrobot();



    }
}
