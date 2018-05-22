import service.ScriptReaderService;

import java.io.*;
import java.util.*;

public class Main {

    private static ScriptReaderService scriptReaderService;

    private static final String FILENAME = "D:\\Misha\\Lessons\\lesson 33 - 22.05.2018\\src\\main\\resources\\test_db_public_student.sql";
    private static final String INSERT_SCRIPT = "INSERT INTO student (name, ser_name, phone, email) VALUES ('bim', 'frick', '+380503456785', 'bim@mail.ru')";

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i <= 10; i++){
            students.add(new Student("alina" + i, "kurt" + i, "+38050320" + i , "alina" + i + "@gmail.com"));
        }


        //Todo  проверить запись, еслинаша файл пустой.


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
            for (Student student : students) {
                bw.write(INSERT_SCRIPT + " " + student.getName() + " " + student.getSer_name() + " " + student.getPhone() + ", " + student.getEmail());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
