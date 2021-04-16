package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Integer find(User user);
    Integer findByUsername(String username);
    Integer insertOne(User user);

}
