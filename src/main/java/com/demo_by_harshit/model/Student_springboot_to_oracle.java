package com.demo_by_harshit.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="DemoTable")
public class Student_springboot_to_oracle {

    @Id// this will make this column as primary key
    @GeneratedValue // Automatically increment current 1,2,3,......14,15
    Long id;// primary key unique value

    private String nickname;
    private String studyclass;
    private int height;

    //default constructor


    public Student_springboot_to_oracle() {
    }

    public Student_springboot_to_oracle(String nickname, String studyclass, int height) {
        this.nickname = nickname;
        this.studyclass = studyclass;
        this.height = height;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStudyclass() {
        return studyclass;
    }

    public void setStudyclass(String studyclass) {
        this.studyclass = studyclass;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
