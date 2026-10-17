package com.ai.tool_calling.controller;

import com.ai.tool_calling.entity.OrderEntity;
import com.ai.tool_calling.services.OrderService;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class OrderController {
    @Autowired
    private final OrderService orderService;

    OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping(value="/createOrder")
    public String createOrder(@RequestBody OrderEntity orderEntity) {

        return orderService.processCreateOrder(orderEntity);

    }
    @GetMapping(value="/status/{orderId}")
    public String getOrderStatus(@PathVariable("orderId")BigInteger orderId) {

        return orderService.processOrderStatus(orderId);

    }

}