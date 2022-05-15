package com.demo_by_harshit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParam_Assignment {
    //calculator
    //RequestParam : endpoint? var_name = value
    //RequestParam : addition? a = value & b = value

    @RequestMapping("/addition")
    public String addition(@RequestParam int a, @RequestParam int b){
        int result= a+b;
        return "addition of a & b is : "+result;
    }

    @RequestMapping("/sub")
    public String subtraction(@RequestParam int a, @RequestParam int b){

        int result = a-b;
        return "subtraction of a & b is : "+result;
    }

    @RequestMapping("/mul")
    public String multiplication(@RequestParam int a , @RequestParam int b){

        int result= a*b;
        return "multiplication of a & b is :"+result;
    }

    @RequestMapping("/div")
    public String division(@RequestParam double a, @RequestParam double b){

        double result= a/b;
        return "division of a & b is :"+result;

    }

}
