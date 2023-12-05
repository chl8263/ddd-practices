package com.example.dddpractices.product.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.aspectj.weaver.tools.Trace;

import java.util.Date;

@Embeddable
public class Image {

    @Column
    private String imageType;

    @Column
    private String path;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date uploadDate;

    public boolean hasThumbnail() {
        if (imageType.equals("II")) {
            return true;
        } else {
            return false;
        }
    }
}
