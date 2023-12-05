package com.example.dddpractices.product.domain;

import com.example.dddpractices.pay.domain.Money;
import com.example.dddpractices.pay.util.MoneyConverter;
import jakarta.persistence.*;

import java.awt.*;
import java.util.ArrayList;

@Entity
public class Product {

    @EmbeddedId
    private ProductId id;

    private String name;

    @Convert(converter = MoneyConverter.class)
    private Money price;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    @JoinColumn(name = "product_id")
    @OrderColumn(name = "list_idx")
    private List<Image> images = new ArrayList<>();
//    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
//    @JoinColumn(name = "product_id")
//    @OrderColumn(name = "list_idx")
//    private List<Image> images = new ArrayList<>();
}
