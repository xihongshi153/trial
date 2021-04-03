package com.example.demo.service;

import com.entity.Account;
import com.example.demo.mapper.AccountMapper;
import com.mapper.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {


    @Autowired
    private AccountMapper accountDao;
    // 1查询所有记录
    public List<com.example.demo.domain.Account> findAll() {
        return accountDao.findAll();
    }
    // 2通过id删除记录
    void deleteByPrimaryKey(String id) {
        accountDao.deleteByPrimaryKey(id);
    }
    // 3插入记录
    void insert(com.example.demo.domain.Account record) {
        accountDao.insert(record);
    } // 4通过id查找对象
    com.example.demo.domain.Account selectByPrimaryKey(String id) {
        return accountDao.selectByPrimaryKey(id);
    }
    // 5更新Account
    void updateByPrimaryKey(com.example.demo.domain.Account record) {
        accountDao.updateByPrimaryKey(record);
    }
    // 6转账功能 输入转出人id，转入人id，转账金额 实现转账
    public void transfer(String remitterId,String remitteeId,int money) {
        com.example.demo.domain.Account account1=selectByPrimaryKey(remitterId);
        com.example.demo.domain.Account account2=selectByPrimaryKey(remitteeId);
        account1.setMoney(account1.getMoney()-money);
        account2.setMoney(account2.getMoney()+money);
        updateByPrimaryKey(account1);
        updateByPrimaryKey(account2);
    }
}
