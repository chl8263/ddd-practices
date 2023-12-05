package com.example.dddpractices.common.domain;

import com.example.dddpractices.common.util.EmailSetConverter;
import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "emails")
    @Convert(converter = EmailSetConverter.class)
    private EmailSet emailSet;
}
