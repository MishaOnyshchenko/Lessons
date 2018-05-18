package journal;


public class StudListRunner {

    public static void main(String[] args) {

        StudListJournal slj = new StudListJournal();

        Student stud1 = new Student(1,"Vasiliy", "Terkin", "Vasek");
        Student stud2 = new Student(2,"Ivan", "Susanin", "Vano");
        Student stud3 = new Student(3, "Alexandr", "Muzychko", "Beliy");

        slj.addStudent(stud1);
        slj.addStudent(stud2);
        slj.addStudent(stud3);

        slj.getStudentList();

        slj.getStudent(2);
    }
}
