package com.example.jpa_new_demo.controller;

import com.example.jpa_new_demo.dao.entity.StudentEntity;
import com.example.jpa_new_demo.dto.StudentDto;
import com.example.jpa_new_demo.service.StudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
public class TestRestController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/")
    public String test() {
        log.info("test controller");
        return "Hello boot";
    }

    @PostMapping("/student")
    public String post(@RequestBody StudentDto studentDto) {
        log.info("studentDto ->", studentDto);
        return studentService.addStudent(studentDto);
    }

    @GetMapping("/student")
    public List<StudentEntity> getStudent() {
        log.info("return all student");
        return studentService.allStudent();
    }

    @GetMapping("/student/{name}/{age}")
    public StudentEntity post(@PathVariable String name, @PathVariable int age) {
        log.info("return by name and age");
        return studentService.findByNameAndAge(name, age);
    }

}
