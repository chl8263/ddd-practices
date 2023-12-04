package com.example.dddpractices.pay.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Money {

    private int money;

    protected Money() {
    }

    private Money(int money) {
        this.money = money;
    }

    public static Money createValueOf(int money) {
        return new Money(money);
    }

    public int getValue() {
        return money;
    }
}
