package com.demo_by_harshit.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariable_demo {

    //PathVariable = ("/endpoint/{name}")

    @RequestMapping("/PathVariable/{name}")
    public String hello(@PathVariable String name){

        return "Welcome to spring boot " +name;
    }

    @RequestMapping("/voting_eligibility/{age}")
    public String eligibility(@PathVariable int age){
        if(age > 18){
            return "Your age is  " +age + " : You are eligible for voting ";
        }
        else {
            return "Your age is " +age + " : You are not eligible for  voting";
        }
    }

    @RequestMapping("/product/{price}/{name}")
    public String checkPrice(@PathVariable double price,@PathVariable String name){

        if(price<5000){
            return "Product is not costly :"+price + name;
        }
        else {
            return "Product is  costly :"+price +name ;
        }
    }

}
