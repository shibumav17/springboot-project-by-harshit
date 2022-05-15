package com.demo_by_harshit.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariable_Assignment {

    //calculator

    //PathVariable = ("/endpoint/{name}")

    @RequestMapping("/addition/{a}/{b}")
    public String addition(@PathVariable int a, @PathVariable int b){
        return "Addition of a and b : " +(a+b);
    }

    @RequestMapping("/subtraction/{a}/{b}")
    public String subtraction (@PathVariable int a , @PathVariable int b){
        return "Subtraction of a from b : " +(b-a);
    }

    @RequestMapping("/multiplication/{a}/{b}")
    public String multiplication (@PathVariable int a , @PathVariable int b){
        return "Multiplication of a and b : " +(a*b);
    }

    @RequestMapping("/division/{a}/{b}")
    public String division (@PathVariable int a , @PathVariable int b){
        return "Division of a from b : " +(a/b);
    }

}
