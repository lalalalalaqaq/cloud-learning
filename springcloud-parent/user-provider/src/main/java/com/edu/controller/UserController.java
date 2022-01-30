package com.edu.controller;

import com.edu.pojo.User;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @Author: 马伟奇
 * @CreateTime: 2021-07-13
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * /id
     * ?id
     */
    @RequestMapping("/find/{id}")
    public User findUserById(@PathVariable(value = "id")Integer id){

        if(id == 3){
            throw new RuntimeException("抛出异常");
        }

        User user = userService.findUserById(id);
        user.setName("user-provider");
        return user;
    }


}