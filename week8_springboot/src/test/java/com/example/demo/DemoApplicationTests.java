package com.example.demo;

import com.example.demo.domain.Account;
import com.example.demo.service.AccountService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Autowired
	private AccountService accountService;

	@Test
	public void contextLoads() {
	}
	@Test
	public void testMybatis(){
		List<Account> all = accountService.findAll();
		System.out.println(all);
	}
	@Test
	public void testtransfer(){
		accountService.transfer("1","2",500);
		List<Account> all = accountService.findAll();
		System.out.println(all);
	}

}
