package com.example.dddpractices.order.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    @Column
    private String zipCode;
    @Column
    private String address1;
    @Column
    private String address2;

    protected Address() {}

    private Address(String zipCode, String address1, String address2) {
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
    }

    public static Address from(String zipCode, String address1, String address2) {
        return new Address(zipCode, address1, address2);
    }
}
