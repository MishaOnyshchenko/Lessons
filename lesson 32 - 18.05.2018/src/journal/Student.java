package journal;


public class Student {

    private int id;
    private String name;
    private String secondName;
    private String keyName;

    public Student(int id, String name, String secondName, String keyName) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.keyName = keyName;
    }

    public int getId() {
        return id;
    }

    public String getKeyName() {
        return keyName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return  id + ". " +
                keyName + ", " +
                name + " " +
                secondName + ".";

    }
}
