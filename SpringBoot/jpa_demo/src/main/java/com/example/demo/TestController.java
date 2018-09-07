package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
public class TestController {


    @GetMapping("/")
    public String test(){
        log.info("test controller");
        return "Hello boot";
    }

    @PostMapping("/post")
    public String post(@RequestBody String student){
        log.info("test controller work");
        log.info("student() ", student);
        return "Hello post";
    }

}
