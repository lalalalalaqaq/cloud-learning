package com.edu.controller;

import com.edu.feign.UserClient;
import com.edu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConsumerFeignController
 *
 * @CreateTime: 2020-03-22
 * @Description:
 */
@RestController
@RequestMapping(value = "/feign")
public class ConsumerFeignController {


    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/{id}")
    public User queryById(@PathVariable(value = "id")Integer id){
        return userClient.findById(id);
    }
}