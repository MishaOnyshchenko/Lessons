package com.example.demo.controler;


import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class FirstController {

    @GetMapping("/book/{id}")
    public String get(PathVariable){
        Log.in
//        Log.info("I am info");
        return ok;
    }
    @PostMapping("/book")
    public String post(@RequestBody String ){
//        Log.info("I am info");
        return ;
    }



}
