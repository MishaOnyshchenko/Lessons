package com.example.jpa_new_demo.service;

import com.example.jpa_new_demo.dao.entity.StudentEntity;
import com.example.jpa_new_demo.dao.repository.StudentRepository;
import com.example.jpa_new_demo.dto.StudentDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(StudentDto studentDto){

        StudentEntity entity = new StudentEntity();
        entity.setName(studentDto.getName());
        entity.setAge(studentDto.getAge());
        entity.setStreet(studentDto.getStreet());
        log.info(entity);
        try{
            studentRepository.saveAndFlush(entity);
            log.info("student saved");
            return "student saved";
        }catch(Exception e){
            log.info("student didn't saved");
            e.printStackTrace();
            return "Error, student didn't saved";
        }
    }

    public List<StudentEntity> allStudent(){
        return studentRepository.findAll();
    }

    public StudentEntity findByNameAndAge(String name, int age){
        return studentRepository.findByNameAndAge(name, age);
    }


}
