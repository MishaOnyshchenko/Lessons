package com.example.jpa_new_demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TestDto {


    @JsonProperty("glossary")
    private Glossary glossary;
}
