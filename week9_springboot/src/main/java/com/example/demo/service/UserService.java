package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean register(User user){
        if(userMapper.findByUsername(user.getUsername()) >0 ){
            return  false;
        }
        userMapper.insertOne(user);
        return true;
    }
    public boolean login(User user){
        if(userMapper.find(user)==1){
            return true;
        } else {
            return false;
        }
    }

}
