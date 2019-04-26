package com.github.nut077.webservice.entity;

import javax.persistence.*;

@SequenceGenerator(name = "posts_seq")
@Entity(name = "posts")
public class Post extends Common {

    @Id
    @GeneratedValue(generator = "posts_seq")
    private Long id;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
