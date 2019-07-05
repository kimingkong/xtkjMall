package com.example.demo.serviceImpl;

import com.example.demo.dao.OrderDao;
import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: XTmall
 * @Date: 2019/7/4 14:20
 * @Author: Fox
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public List<Order> getAllOrders() {
        return orderDao.getOrder();
    }
}
