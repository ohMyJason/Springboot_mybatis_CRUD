package com.mybatis.demo.demo.dao;

import com.mybatis.demo.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);
    int insert(User record);
    int insertSelective(User record);
    User selectByPrimaryKey(Integer userId);
    int updateByPrimaryKeySelective(User record);
    int updateByPrimaryKey(User record);
}