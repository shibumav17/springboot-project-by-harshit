package com.demo_by_harshit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @RequestMapping("/add")
    public Integer addition() {
        int a = 20;
        int b = 30;
        int result = a+b;
        return result;
    }
    @RequestMapping("/subtraction")
    public Integer subtraction(){
    int a = 40;
    int b = 50;
    int result = a-b;
    return result;
    }
    @RequestMapping("/division")
    public Integer division(){
    int a = 20;
    int b = 10;
    int result = a/b;
    return result;
    }
    @RequestMapping("/multiplication")
    public Integer multiplication() {
        int a = 20;
        int b = 10;
        int result = a * b;
        return result;
    }

}
