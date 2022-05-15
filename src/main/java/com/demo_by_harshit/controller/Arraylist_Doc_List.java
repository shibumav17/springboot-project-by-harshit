package com.demo_by_harshit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Arraylist_Doc_List {

    @RequestMapping("/doc-list")
    public ArrayList<String> DoctorData(){
        ArrayList<String> Doc = new ArrayList<>();
        Doc.add("bjbs");
        Doc.add("jgjb");
        Doc.add("scvsg");
        return Doc;
    }
}
