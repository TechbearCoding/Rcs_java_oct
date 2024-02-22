package com.example.day23.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value="/employees", method= RequestMethod.GET)
    String getEmployees(){
        System.out.println("This is random message");
        return "Demo";
    }
}
