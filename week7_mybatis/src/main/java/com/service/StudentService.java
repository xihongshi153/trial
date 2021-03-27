package com.service;

import com.entity.Student;
import com.mapper.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentService {
    private StudentDao studentDao;
    public StudentService() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession(true);
        studentDao = session.getMapper(StudentDao.class);
    }
    public void insert(Student student){
        studentDao.Insert(student);
    }
    public List<Student> findAll(){
        return studentDao.findAll();
    }
    public void deleteBySno(String sno){
        studentDao.deleteBySno(sno);
    }
    public Student findBySno(String sno){
        return studentDao.findBySno(sno);
    }
    public void updateBySno(Student student){
        studentDao.updateBySno(student);
    }


}
