package com.example.dddpractices.order.v1.spec;

import com.example.dddpractices.order.domain.Order;

public class OrderSpec implements Specification<Order> {

    private String ordererId;

    public OrderSpec(String ordererId) {
        this.ordererId = ordererId;
    }

    @Override
    public boolean isSatisfiedBy(Order agg) {
        return agg.getNumber().equals(ordererId);
    }

}
