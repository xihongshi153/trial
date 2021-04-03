package com.example.demo.mapper;

import com.example.demo.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface AccountMapper {

    // 1查询所有记录
    List<Account> findAll();
    // 2通过id删除记录
    int deleteByPrimaryKey(String id);
    // 3插入记录
    int insert(Account record);
    // 4通过id查找对象
    Account selectByPrimaryKey(String id);
    // 5更新Account
    int updateByPrimaryKey(Account record);


}
