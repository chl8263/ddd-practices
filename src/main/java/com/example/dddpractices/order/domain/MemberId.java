package com.example.dddpractices.order.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class MemberId {

    @Column(name = "member_id")
    private Long id;
}
