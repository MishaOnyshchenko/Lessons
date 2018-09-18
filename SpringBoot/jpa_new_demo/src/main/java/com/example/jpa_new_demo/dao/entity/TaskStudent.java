package com.example.jpa_new_demo.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class TaskStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String title;
}
