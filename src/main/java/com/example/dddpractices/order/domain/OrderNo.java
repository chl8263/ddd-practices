package com.example.dddpractices.order.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrderNo implements Serializable {

    @Column
    private Long number;
}
