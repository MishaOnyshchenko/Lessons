package service;

import domenObject.Student;

import java.io.*;
import java.util.*;

public class ScriptReader implements ScriptReaderService {

    private static final String INSERT_SCRIPT_FILE = "D:\\0 - Java\\0 - projects\\javaKonang\\Misha_Onyshchenko\\student_home_works\\Misha_Onyshchenko\\src\\hw_19_05_18\\src\\main\\resources\\insertStudent.sql";

    @Override
    public void readscript() {
        Student student = null;
        String[] studFieldMass = null;
        List<String> surnameList = new ArrayList<>();
        int studentCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(INSERT_SCRIPT_FILE))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
                String studentDataStr = sCurrentLine.substring(sCurrentLine.indexOf("VALUES") + 8, sCurrentLine.length() - 2).replace("'", "").trim();
                studFieldMass = studentDataStr.split(",");
                student = new Student(studFieldMass[0], studFieldMass[1], studFieldMass[2], studFieldMass[3]);

                if (surnameList.contains(student.getSer_name())) {
                    System.out.println(student.getSer_name());
                }
                // System.out.println(student.getName() + "" + student.getSerName() + "" + student.getPhone() + " " + student.getEmail());
                studentCount++;
//                if (student.getEmail().contains("gmail.com")) {
//                    System.out.println(student.getName() + " " + student.getEmail());
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.printf("student count in table =" + studentCount);
    }
}
