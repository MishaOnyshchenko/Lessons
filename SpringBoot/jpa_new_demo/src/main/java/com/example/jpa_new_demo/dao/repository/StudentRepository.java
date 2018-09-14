package com.example.jpa_new_demo.dao.repository;

import com.example.jpa_new_demo.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long>{

//    @Query
    StudentEntity findByNameAndAge(String name, int age);

//    @Query
//    StudentEntity getStudentByNameAndAgeReturn();
}
