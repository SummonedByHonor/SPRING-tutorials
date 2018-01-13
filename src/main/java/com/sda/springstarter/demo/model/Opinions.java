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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
