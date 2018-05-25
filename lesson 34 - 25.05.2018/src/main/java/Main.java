import domenObject.Student;
import service.ScriptReader;

import java.io.*;
import java.util.*;

public class Main {

    private static final String INSERT_SCRIPT_FILE = "D:\\0 - Java\\0 - projects\\javaKonang\\Misha_Onyshchenko\\student_home_works\\Misha_Onyshchenko\\src\\hw_19_05_18\\src\\main\\resources\\insertStudent.sql";
    private static final String INSERT_SCRIPT = "INSERT INTO student(name, ser_name, phone, email) VALUES (";

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            students.add(new Student("alina" + i, "kurt" + i, "+3805023" + i, "all@gmaill.com" + i));
        }
        //Todo  проверить запись, еслинаша файл пустой.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(INSERT_SCRIPT_FILE, true))) {
            for (Student student : students) {
                bw.write(INSERT_SCRIPT +"'"+student.getName() + "', '" + student.getSer_name() + "', '" + student.getPhone() + "', '" + student.getEmail()+"');");
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ScriptReader scriptReader = new ScriptReader();
        scriptReader.readscript();

    }
}