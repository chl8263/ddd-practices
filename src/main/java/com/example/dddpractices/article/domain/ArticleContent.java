package com.example.dddpractices.article.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ArticleContent {

    @Column
    private int content;

    @Column
    private String contentType;

    protected ArticleContent() {}

    private ArticleContent(int content, String contentType) {
        this.content = content;
        this.contentType = contentType;
    }

    public ArticleContent from(int content, String contentType) {
        return new ArticleContent(content, contentType);
    }
}
