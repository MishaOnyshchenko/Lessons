import lombok.Data;

public class Student {

   private String name;
   private String secondName;
   private String thirdName;
   private int id;

    public Student(String name, String secondName, String thirdName, int id) {
        this.name = name;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.id = id;
    }
}
