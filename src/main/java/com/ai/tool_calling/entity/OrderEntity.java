package com.ai.tool_calling.entity;


import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "orderEntity")
@Setter
@Getter
public class OrderEntity {
    @Id
    @Column(name="order_id")

    private BigInteger orderId;

    @Column(name="order_name")
    private String productName;

    @Column(name="order_status")
    private String orderStatus;

    private Long price;



}