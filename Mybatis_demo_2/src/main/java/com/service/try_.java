package com.service;

import com.entity.Student;

import java.io.IOException;

public class try_ {
    public static void main(String[] args) throws IOException {
        StudentService stu= new StudentService();
        System.out.println(stu.findAll());
        stu.insert(new Student("s001","谢",18,"重邮"));
        stu.insert(new Student("s002","曹",18,"重邮"));
        stu.insert(new Student("s003","赵",18,"重邮"));
        System.out.println(stu.findAll());
        stu.findBySno("s001");
        stu.deleteBySno("s001");
        System.out.println(stu.findAll());
        stu.updateBySno(new Student("s003","罗",19,"重邮"));
        System.out.println(stu.findAll());

    }
}
