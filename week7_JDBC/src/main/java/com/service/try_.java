package com.service;

import com.entity.Account;

import java.io.IOException;
import java.util.Date;

public class try_ {
    public static void main(String[] args) throws IOException {
        AccountService a=new AccountService();
//        a.insert(new Account("1","jack",1000,new Date(2021-03-10),new Date(2021-03-19)));
//        a.insert(new Account("2","Tom",500,new Date(),new Date()));
//        a.insert(new Account("3","micky",800,new Date(),new Date()));
        System.out.println(a.findAll());
        a.transfer("1","3",500);
        System.out.println(a.findAll());
    }
}
