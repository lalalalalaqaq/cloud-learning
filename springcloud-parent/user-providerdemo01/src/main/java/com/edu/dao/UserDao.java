package com.edu.dao;

import com.edu.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * UserDao
 * T:表示需要操作哪个实体类
 * ID：表示实体类的类型
 */

public interface UserDao extends JpaRepository<User, Integer> {

}

