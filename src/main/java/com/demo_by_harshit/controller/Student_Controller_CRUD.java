package com.demo_by_harshit.controller;

import com.demo_by_harshit.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

    //CRUD
@RestController
public class Student_Controller_CRUD {
    ArrayList <Student> studentArrayList = new ArrayList<>();

    //C : CREATE

    @RequestMapping("/add_student")
    public String addStudent(){
        Student student = new Student("ravi", 24,"statistics");
        studentArrayList.add(student);
        return "Student Added Successfully...." ;
    }

    //R : READ OR GET
    @RequestMapping("/get_all")
    public ArrayList<Student> getStudentArrayList(){
        return studentArrayList;
    }

    //U : UPDATE

    @RequestMapping("/update_student")
    public String updateStudent(@RequestParam  String name){
        studentArrayList.get(0).setName(name);
        return "Student name updated successfully " +name;
    }

    //D : DELETE

     @RequestMapping("/delete_student/{index}")
     public String remove(@PathVariable int index){
        studentArrayList.remove(index);
        return "Student removed successfully....";
     }



}
