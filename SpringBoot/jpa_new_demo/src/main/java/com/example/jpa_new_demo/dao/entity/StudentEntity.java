package com.example.jpa_new_demo.dao.entity;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "new_student")

public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column
    private String street;
}