package com.gk.study.service;


import com.gk.study.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrderList();
    String createOrder(Order order);
    void deleteOrder(String id);

    void updateOrder(Order order);

    List<Order> getUserOrderList(String userId, String status);

    Order getUserOrder(String id);

    Order getUserOrderById(String id);
}
