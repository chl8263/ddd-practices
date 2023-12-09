package com.example.dddpractices.order.v1.service;

import com.example.dddpractices.order.domain.Order;
import com.example.dddpractices.order.v1.repository.MemoryOrderRepository;
import com.example.dddpractices.order.v1.repository.OrderRepository;
import com.example.dddpractices.order.v1.spec.OrderSpec;
import com.example.dddpractices.order.v1.spec.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository = new MemoryOrderRepository();

    public List<Order> specOrder() {
        Specification<Order> specification = new OrderSpec("ewan");
        List<Order> orders = orderRepository.findAll(specification);
        return orders;
    }
}
