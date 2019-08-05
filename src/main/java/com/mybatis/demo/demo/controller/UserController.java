package com.mybatis.demo.demo.controller;

import com.mybatis.demo.demo.dao.UserMapper;
import com.mybatis.demo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘佳昇
 * @Date 2019/8/6 0:30
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;


    @PostMapping("/addUser")
    public int addUser(User user){
        return userMapper.insert(user);
    }
    @PostMapping("/deleteUser")
    public int deleteUser(User user){
        return userMapper.deleteByPrimaryKey(user.getUserId());
    }
    @PostMapping("/updateUser")
    public int updateUser(User user){
        return userMapper.updateByPrimaryKey(user);
    }
    @PostMapping("/selectUser")
    public User selectUser(User user){
        return userMapper.selectByPrimaryKey(user.getUserId());
    }




}
