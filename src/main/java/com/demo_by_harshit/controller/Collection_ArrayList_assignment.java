package com.demo_by_harshit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Collection_ArrayList_assignment {

    @RequestMapping("/citylist")
    public ArrayList <String> citylist() {
        ArrayList <String> citylist = new ArrayList();
        citylist.add("Agra");
        citylist.add("Pune");
        citylist.add("Delhi");
        citylist.add("goa");
        return citylist;
    }
}

