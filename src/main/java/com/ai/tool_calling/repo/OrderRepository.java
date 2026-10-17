package com.ai.tool_calling.repo;

import java.math.BigInteger;

import com.ai.tool_calling.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<OrderEntity,BigInteger>{


}
