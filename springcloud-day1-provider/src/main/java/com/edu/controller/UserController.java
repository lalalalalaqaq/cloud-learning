package com.edu.controller;

import com.edu.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/list")
    public List<User> list(){
        List<User> lists = new ArrayList<>();
        lists.add(new User("张三","123",19));
        lists.add(new User("李四","123",19));
        lists.add(new User("王五","123",19));
        return lists;
    }
}
