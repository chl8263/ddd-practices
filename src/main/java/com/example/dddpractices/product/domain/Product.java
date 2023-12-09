package com.example.dddpractices.product.domain;

import com.example.dddpractices.pay.domain.Money;
import com.example.dddpractices.pay.util.MoneyConverter;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ProductId id;

    private String name;

    @Convert(converter = MoneyConverter.class)
    private Money price;

//    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
//    @JoinColumn(name = "product_id")
//    @OrderColumn(name = "list_idx")
//    private ArrayList<Image> images = new ArrayList<>();
//    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
//    @JoinColumn(name = "product_id")
//    @OrderColumn(name = "list_idx")
//    private List<Image> images = new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "product_option", joinColumns = @JoinColumn(name = "product_id"))
    @OrderColumn(name = "list_idx")
    private List<Option> options = new ArrayList<>();

    public void removeOptions(int optIdx) {
        // 실제 컬렉션에 접근할 때 로딩된다.
        this.options.remove(optIdx);
    }

}
