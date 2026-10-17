package com.ai.tool_calling.services;

import java.math.BigInteger;
import java.util.Optional;

import com.ai.tool_calling.entity.OrderEntity;
import com.ai.tool_calling.repo.OrderRepository;
import org.springframework.stereotype.Service;


@Service

public class OrderService {
    private OrderRepository orderRepository;
    public String processCreateOrder(OrderEntity entity) {
        orderRepository.save(entity);
        return "Order created successfilly";

    }

    public String processOrderStatus(BigInteger orderId) {
        Optional<OrderEntity> optional =orderRepository.findById(orderId);
        OrderEntity orderEntity=optional.get();
        return  orderEntity.getOrderStatus();
    }
}