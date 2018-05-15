import java.util.*;

public class Main3 {

    public static final String FILENAME = "D:\\Misha\\journal.txt";

    public static void main(String[] args) {

        StudentJournal sj = new StudentJournal();

        Student stud1 = new Student("Ivan", "Susanin", "Vano", 1);
        Student stud2 = new Student("Alexander", "Baumann", "Sanya", 2);

        sj.addStudent(stud1);
        sj.addStudent(stud2);

        sj.readStudent();
    }
}
