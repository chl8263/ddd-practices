package com.example.dddpractices.product.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class ProductId implements Serializable {

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
