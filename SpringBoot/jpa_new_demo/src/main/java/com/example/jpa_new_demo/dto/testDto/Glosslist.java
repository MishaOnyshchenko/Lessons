package com.example.jpa_new_demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Glosslist {
    @JsonProperty("GlossEntry")
    private Glossentry glossentry;
}
