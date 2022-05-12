package com.demo_by_harshit.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //step 1: use this annotation on top of class
public class Demo_Controller {

    // method to print Hello Spring boot in console
    @RequestMapping("/hello") // step 2: use this annotation to create endpoint
    public void hello(){
        System.out.println("Hello Spring Boot");
    }

    //print on browser:
    @RequestMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring Boot";
    }

    //endpoint
    @RequestMapping("/int_value")
    public int int_value(){
        return 17;
    }



}
