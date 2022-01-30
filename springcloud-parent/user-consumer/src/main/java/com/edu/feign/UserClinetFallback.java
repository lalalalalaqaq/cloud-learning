package com.edu.feign;

import com.edu.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClinetFallback implements UserClient{
    @Override
    public User findById(Integer id) {
        User user = new User();
        user.setName("开启熔断，不能提供服务");
        return user;
    }
}
