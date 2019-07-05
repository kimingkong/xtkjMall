package com.example.demo.dao;

import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: XTmall
 * @Date: 2019/7/4 14:15
 * @Author: Fox
 * @Description:
 */
@Mapper
public interface OrderDao {
    @Select("select * from t_order")
    List<Order> getOrder();
}
