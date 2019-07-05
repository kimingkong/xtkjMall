package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: XTmall
 * @Date: 2019/7/4 14:23
 * @Author: Fox
 * @Description:
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("getAllOrders")
    public List<Order> getAllOrders(){
        System.out.println(orderService.getAllOrders());
        return orderService.getAllOrders();
    }

}
