package com.demo_by_harshit.controller;

import com.demo_by_harshit.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Model_class_Student {

    @RequestMapping("/studentsinfo")
    public ArrayList<Student> students_information(){

        ArrayList <Student> info_list = new ArrayList<>();
        Student std1 = new Student("ram",32,"cs");
        Student std2 = new Student("mohan",30,"me");

        info_list.add(std1);
        info_list.add(std2);

        return info_list;
    }
}
