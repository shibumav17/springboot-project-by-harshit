package com.demo_by_harshit.controller;

import com.demo_by_harshit.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class Student_Controller_Postman {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    //C : CREATE
    @RequestMapping(value = "/add_student", method = RequestMethod.POST)
    public String addStudent(@RequestBody Student student ){
        studentArrayList.add(student);
        return "Student Added Successfully...." ;
    }
    //R : READ OR GET
    @RequestMapping(value = "/get_all", method = RequestMethod.GET)
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }
    //U : UPDATE
    @RequestMapping(value = "/update_student", method = RequestMethod.PUT)
    public String updateStudent(@RequestParam String name){
        studentArrayList.get(0).setName(name);
        return "Student name updated successfully " +name;
    }
    //D : DELETE
    @RequestMapping(value = "/delete_student/{index}", method = RequestMethod.DELETE)
    public String remove(@PathVariable int index){
        studentArrayList.remove(index);
        return "Student removed successfully....";
    }

}

