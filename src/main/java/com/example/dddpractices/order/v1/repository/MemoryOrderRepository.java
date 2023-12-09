package com.example.dddpractices.order.v1.repository;

import com.example.dddpractices.order.domain.Order;
import com.example.dddpractices.order.v1.spec.Specification;

import java.util.List;

public class MemoryOrderRepository implements OrderRepository{
    @Override
    public List<Order> findAll(Specification<Order> spec) {
        List<Order> allOrders = findAll(spec);
        return allOrders.stream()
                .filter(order -> spec.isSatisfiedBy(order))
                .toList();
    }

}
