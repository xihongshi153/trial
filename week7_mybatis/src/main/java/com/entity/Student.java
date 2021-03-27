package com.entity;

import java.io.Serializable;

public class Student implements Serializable {
    public Student(){}

    public Student(String sno, String name, Integer age, String college) {
        this.sno = sno;
        this.name = name;
        this.age = age;
        this.college = college;
    }

    private String sno;
    private  String name;
    private  Integer age;
    private String college;

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                '}';
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
