package com.example.dddpractices.order.v2.spec;

import com.example.dddpractices.order.domain.Order;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class OrderIdSpec implements Specification<Order> {

    private String orderId;



    @Override
    public Specification<Order> and(Specification<Order> other) {
        return Specification.super.and(other);
    }

    @Override
    public Specification<Order> or(Specification<Order> other) {
        return Specification.super.or(other);
    }

    @Override
    public Predicate toPredicate(Root<Order> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return null;
        //return criteriaBuilder.equal(root.get(Order.orderId), orderId);
    }
}
