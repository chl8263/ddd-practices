package com.example.dddpractices.order.domain;

import com.example.dddpractices.pay.domain.Money;
import com.example.dddpractices.product.domain.ProductId;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderLine {

    @Column
    private ProductId productId;

    @Column
    private Money price;

    @Column
    private int quantity;

    @Column
    private Money amounts;

    protected OrderLine() {}

    private OrderLine(ProductId productId, Money price, int quantity, Money amounts) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.amounts = amounts;
    }

    public static OrderLine from(ProductId productId, Money price, int quantity, Money amounts) {
        return new OrderLine(productId, price, quantity, amounts);
    }
}
