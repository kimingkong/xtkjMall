package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: XTmall
 * @Date: 2019/7/4 17:54
 * @Author: Fox
 * @Description:
 */
@Mapper
public interface UserDao {
    @Select("select * from t_user")
    List<User> getUsers();
}
