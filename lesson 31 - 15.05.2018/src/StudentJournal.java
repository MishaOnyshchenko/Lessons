import java.util.*;

public class StudentJournal implements Journal {

    Student student;
    ArrayList<Student> studlist = new ArrayList<>();


    @Override
    public void addStudent(Student student) {
        studlist.add(student);

    }

    @Override
    public void readStudent() {
        for (Student s: studlist) {
            System.out.println(s);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentJournal that = (StudentJournal) o;
        return Objects.equals(student, that.student) &&
                Objects.equals(studlist, that.studlist);
    }

    @Override
    public int hashCode() {

        return Objects.hash(student, studlist);
    }

    @Override
    public String toString() {
        return "StudentJournal{" +
                "student=" + student +
                ", studlist=" + studlist +
                '}';
    }
}
