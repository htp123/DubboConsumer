package com.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.api.UserService;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello.html")
    @ResponseBody
    public String sayHello(String name) {
        String welcome = userService.sayHi(name);
        return welcome;
    }
}