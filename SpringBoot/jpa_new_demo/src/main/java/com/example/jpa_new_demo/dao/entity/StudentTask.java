package com.example.jpa_new_demo.dao.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@Data
@Entity
@Table(name = "student_task")
public class StudentTask {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private String title;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private StudentEntity studentEntity;
}
