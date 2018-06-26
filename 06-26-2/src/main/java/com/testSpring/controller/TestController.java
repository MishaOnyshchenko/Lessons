package com.testSpring.controller;
import com.testSpring.config.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String showIndex(Model model){
        model.addAttribute("message", "This is the base url /");
        return "index";
    }

}
