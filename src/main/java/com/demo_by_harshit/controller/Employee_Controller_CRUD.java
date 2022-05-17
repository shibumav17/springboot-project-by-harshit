package com.demo_by_harshit.controller;

import com.demo_by_harshit.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employee_Controller_CRUD {
    //CRUD
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    //C : CREATE
    @RequestMapping("/add_employee")
    public String addEmployee(){
        Employee emp = new Employee("nishant", 23221,"finance");
        employeeArrayList.add(emp);
        return "Employee Added Successfully...";
    }

    //R : READ OR GET
    @RequestMapping("get_emp")
    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    //U : UPDATE
    @RequestMapping("/update_employee")
    public String update_employee(@RequestParam String department){
        employeeArrayList.get(0).setDepartment(department);
        return "Employee department updated successfully..." +department;
    }

    //D : DELETE
    @RequestMapping("/delete_employee/{index}")
    public String remove_employee(@PathVariable int index){
        employeeArrayList.remove(index);
        return "Employee removed successfully ";
    }

}
