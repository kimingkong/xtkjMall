package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @program: XTmall
 * @Date: 2019/7/4 17:57
 * @Author: Fox
 * @Description:
 */
@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("getUsers")
    public HashMap<String,Object> getUsers(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> list=userService.getUsers();
        PageInfo<User> pageInfo=new PageInfo<>(list);
        HashMap<String,Object> hashMap=new HashMap<>();
        hashMap.put("rows",pageInfo.getList());
        hashMap.put("total",pageInfo.getTotal());
        return hashMap;
    }

}
