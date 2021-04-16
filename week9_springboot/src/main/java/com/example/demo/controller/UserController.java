package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    @ResponseBody
    public String login(@RequestParam String username,@RequestParam String password){
        if(userService.login(new User(username,password))){
            return "<h2>登陆成功</h2>";
        }
        return "<h2>登陆失败</h2>";
    }

    @RequestMapping("register")
    @ResponseBody
    public String register(@RequestBody User user){
        if(userService.register(user)){
            return "success";
        }
        return "failed";
    }
}
