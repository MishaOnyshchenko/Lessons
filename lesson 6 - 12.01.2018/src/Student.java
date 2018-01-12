/**
 * Created by java on 12.01.2018.
 */
public class Student {
//    String name;
//    boolean isHungry;
//    boolean isHappy;
//    int age;
//    String livePlace;
//    int width;
//    int height;
//
//    public Student(){
//
//    }
//
//    public Student(String name, boolean isHungry, boolean isHappy, int age, String livePlace, int width, int height) {
//        this.name = name;
//        this.isHungry = isHungry;
//        this.isHappy = isHappy;
//        this.age = age;
//        this.livePlace = livePlace;
//        this.width = width;
//        this.height = height;
//    }
//
//    public Student(boolean isHungry, boolean isHappy) {
//        this.isHungry = isHungry;
//        this.isHappy = isHappy;
//    }
//
//
//
//    public Student(String name, int age, boolean isHappy){
//        this.name = name;
//        this.age = age;
//        this.isHappy = isHappy;
//    }
        //public void conditionStudent(){}

    private String name;
    private boolean isHungry;
    private boolean isHappy;
    private int age;
    private String livePlace;
    private int width;
    private int height;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void isHangry(){
        if(age < 4){
            isHungry = true;
            System.out.println("baby always hungry");
        } else if (age > 5){
            System.out.println("not hungry" + isHungry);
        }
    }

}
