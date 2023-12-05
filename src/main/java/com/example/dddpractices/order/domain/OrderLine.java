package com.example.dddpractices.order.domain;

import com.example.dddpractices.pay.domain.Money;
import com.example.dddpractices.product.domain.ProductId;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderLine {

    @Column
    private ProductId productId;

    @Column
    @AttributeOverrides(
            @AttributeOverride(name = "money", column = @Column(name = "price"))
    )
    private Money price;

    @Column
    private int quantity;

    @Column
    @AttributeOverrides({
            @AttributeOverride(name = "money", column = @Column(name = "amount")),
    })
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
