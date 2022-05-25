package com.demo_by_harshit.controller;

import com.demo_by_harshit.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Employee_Controller_Postman {

    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    //C : CREATE
    @RequestMapping(value = "/add_employee", method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employee){
        employeeArrayList.add(employee);
        return "Employee Added Successfully...";
    }

    //R : READ OR GET
    @RequestMapping(value = "/get_employee_list", method = RequestMethod.GET)
    public ArrayList<Employee> getEmployeeArrayList() {

        return employeeArrayList;
    }

    //U : UPDATE
    @RequestMapping(value = "/update_employee", method = RequestMethod.PUT)
    public String update_employee(@RequestParam String department){
        employeeArrayList.get(0).setDepartment(department);
        return "Employee department updated successfully..." +department;
    }

    //D : DELETE
    @RequestMapping(value = "/delete_employee/{index}", method = RequestMethod.DELETE)
    public String remove_employee(@PathVariable int index){
        employeeArrayList.remove(index);
        return "Employee removed successfully ";
    }
}
