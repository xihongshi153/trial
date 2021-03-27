package com.mapper;

import com.entity.Student;

import java.util.List;

public interface StudentDao {
    //插入数据
    void Insert(Student student);
    //查看所有信息
    List<Student> findAll();
    //根据SNO删除记录
    void deleteBySno(String sno);
    //根据SNO查询记录
    Student findBySno(String sno);
    //修改数据根据SNO
    void updateBySno(Student student);
}
