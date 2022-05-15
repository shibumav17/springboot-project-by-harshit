package com.demo_by_harshit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParam_Demo {

    //RequestParam : endpoint? var_name = value
    //RequestParam : addition? a = value & b = value

    @RequestMapping("/msg")
    public String hello(@RequestParam String message){
        return "Welcome to RequestParam : " +message;
    }

}
