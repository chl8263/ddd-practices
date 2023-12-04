package com.example.dddpractices.order.domain;

import jakarta.persistence.*;

@Embeddable
public class Receiver {

    @Column(name = "receiver_name")
    private String name;

    @Column(name = "receiver_phone")
    private String phone;

    // JPA의 구현체인 hibernate에서 제공하는 다양한 기능을 활용하기 위해서는 public이나 protected 기본 생성자가 필요하다.
    // hibernate가 생성한 proxy 객체를 사용하기 때문.
    // private로 생성자를 만들게 되면 이러한 기능들을 사용하는데 제약이 되기 때문이다.
    // 다만 안정성 측면에서 좀 더 작은 scope 가진 protected 기본 생성자를 주로 사용.
    protected Receiver() {}

    public Receiver(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
