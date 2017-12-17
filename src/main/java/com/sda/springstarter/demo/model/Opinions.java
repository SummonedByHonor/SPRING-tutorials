package com.sda.springstarter.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Opinie")
public class Opinions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nick;

    private String comment;

    public Opinions(Book book, String nick, String comment) {
        this.book = book;
        this.nick = nick;
        this.comment = comment;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private Book book;
}
