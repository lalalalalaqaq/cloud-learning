package com.edu.service;

import com.edu.pojo.User;
import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @Author: 马伟奇
 * @CreateTime: 2021-07-13
 * @Description:
 */
public interface UserService {
    /**
     * 根据id进行查询
     */
    User findUserById(Integer id);
}

