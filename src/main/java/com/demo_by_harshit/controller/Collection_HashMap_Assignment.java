package com.demo_by_harshit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Collection_HashMap_Assignment {

    @RequestMapping("/names")
    public HashMap<Integer,String> name(){
        HashMap <Integer,String> name = new HashMap<>();
        name.put(1,"Harshit");
        name.put(2,"Mukul");
        name.put(3,"Rajat");
        return name;
    }
}
