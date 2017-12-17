package com.sda.springstarter.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Opinie")
public class Opinions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int id_book;

    private String nick;

    private String comment;

    public Opinions(int id_book, String nick, String comment) {
        this.id_book = id_book;
        this.nick = nick;
        this.comment = comment;
    }
}
