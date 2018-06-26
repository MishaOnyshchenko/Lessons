package com.testSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping
public class AddController {


    ArrayList<String> strings = new ArrayList<>(Arrays.asList("Petya", "Kolia", "Vasia"));

    @RequestMapping(method = RequestMethod.GET)
    public String showPage(Model model){
        return "page/add";
    }
}
