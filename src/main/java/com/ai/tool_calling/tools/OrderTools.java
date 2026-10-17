package com.ai.tool_calling.tools;

import java.math.BigInteger;

import com.ai.tool_calling.services.OrderService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderTools {

    @Autowired
    private OrderService orderService;


    @Tool(description="Get the status of an order when"+ " user provides order id")

    public String findOrderStatus(@ToolParam(description="id of the order") BigInteger orderId) {

        return orderService.processOrderStatus(orderId);

    }

    @Tool(description="create a new order"+ "call this method only when user provider"+"Product name,price and orderId")

    public void createOrder(
            @ToolParam(description="name of the product")String productName,@ToolParam(description="price of the product")Long price,@ToolParam(description="id of the product")Long orderId) {

    }


}
