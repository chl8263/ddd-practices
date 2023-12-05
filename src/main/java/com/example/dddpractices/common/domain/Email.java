package com.example.dddpractices.common.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Email {

    private String address;

    protected Email() {}

    private Email(String email) {
        this.address = email;
    }

    public static Email of(String email) {
        return new Email(email);
    }

    public String getAddress() {
        return address;
    }
}
