package com.example.dddpractices.order.v1.repository;


import com.example.dddpractices.order.domain.Order;
import com.example.dddpractices.order.v1.spec.Specification;

import java.util.List;

public interface OrderRepository {
    public List<Order> findAll(Specification<Order> spec);
}
