package com.example.dddpractices.order.v1.spec;

public interface Specification<T> {

    public boolean isSatisfiedBy(T agg);
}
