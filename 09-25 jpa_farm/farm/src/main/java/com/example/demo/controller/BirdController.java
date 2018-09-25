package com.example.demo.controller;

import com.example.demo.dao.BirdEntity;
import com.example.demo.dto.BirdDto;
import com.example.demo.service.BirdService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by java on 25.09.2018.
 */
@RestController("/bird")
@Log4j2
public class BirdController {

    @Autowired
    private BirdService birdService;

    @GetMapping
    public List<BirdDto> getAllBirds(){
        try{
            List<BirdDto> birdDtos = birdService.getAllBirds();
            log.info("return all birds");
            return birdService.getAllBirds();

        }
        catch(Exception e){
            e.getMessage();
            return birdService.getAllBirds();
        }

    }
}
