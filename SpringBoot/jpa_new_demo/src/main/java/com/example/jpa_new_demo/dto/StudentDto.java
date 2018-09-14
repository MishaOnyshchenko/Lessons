package com.example.jpa_new_demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by java on 07.09.2018.
 */
@Data
public class StudentDto {

    @JsonProperty("street")
    private String street;
    @JsonProperty("car")
    private String car;

    @JsonProperty("name")
    private String name;

    @JsonProperty("status")
    private String status;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("age")
    private int age;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("isGoodMan")
    private boolean isGoodMan;


}
