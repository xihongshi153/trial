package com.example.demo.controller;


import com.example.demo.domain.Account;

import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
@Controller
public class MybatisController {
    @Autowired
    private AccountService accountService;

    // 不用Rest风格
    //查询所有

    @RequestMapping("/account/all")
    public List<com.example.demo.domain.Account> findAll() {
        return accountService.findAll();
    }
    //保存account对象
    @RequestMapping("/account/save")
    public void saveAccount(@RequestBody Account account) {
    }

    @RequestMapping("/account/transfer")
    public void transfer(@RequestParam("remitterId") String remitterId,
                         @RequestParam("remitteeId") String remitteeId,
                         @RequestParam("money") int money) {

    }
}
