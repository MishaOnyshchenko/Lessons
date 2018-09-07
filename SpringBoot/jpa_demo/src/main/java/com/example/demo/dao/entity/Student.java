package com.example.demo.dao.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private int age;
}
