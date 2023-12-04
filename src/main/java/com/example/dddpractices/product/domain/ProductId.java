package com.example.dddpractices.product.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductId {

    @Column
    private String productId;

    protected ProductId() {}

    private ProductId(String productId) {
        this.productId = productId;
    }

    public ProductId of(String productId) {
        return new ProductId(productId);
    }
}
