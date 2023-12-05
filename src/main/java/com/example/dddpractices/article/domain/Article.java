package com.example.dddpractices.article.domain;

import jakarta.persistence.*;

@Entity
@SecondaryTable(name = "article_content", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long title;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "content", column = @Column(table = "article_content", name = "content")),
            @AttributeOverride(name = "contentType", column = @Column(table = "article_content", name = "contentType")),
    })
    private ArticleContent articleContent;
}
