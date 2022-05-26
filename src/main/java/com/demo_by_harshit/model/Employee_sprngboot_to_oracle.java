package com.demo_by_harshit.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Demo_Employee_Table")
public class Employee_sprngboot_to_oracle {

    @Id// this will make this column as primary key
    @GeneratedValue // Automatically increment current 1,2,3,......14,15
    Long id;// primary key unique value

    private String cityname;
    private int weight;
    private int salary;

    public Employee_sprngboot_to_oracle(String cityname, int weight, int salary) {
        this.cityname = cityname;
        this.weight = weight;
        this.salary = salary;
    }

    //default constructor
    public Employee_sprngboot_to_oracle() {
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
