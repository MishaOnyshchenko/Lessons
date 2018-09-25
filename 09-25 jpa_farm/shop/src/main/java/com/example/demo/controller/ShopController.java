package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by java on 25.09.2018.
 */
@RestController("/shop")
public class ShopController {



    @GetMapping
    public void shop(){}
}
