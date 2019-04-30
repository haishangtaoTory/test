package com.example.test.controller;

import com.example.test.Model.User;
import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tory(wutao8@xin.com) on 2018/3/11 18:44
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TestService testService;

    @RequestMapping("/info/{userID}")
    public String info(@PathVariable("userID")long id) {
        User user = testService.getUserById(id);
        return user.getUsername();
    }
}
