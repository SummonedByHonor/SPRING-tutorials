package com.sda.springstarter.demo.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "ksiazki")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String author;

    @ManyToOne
    private Authors bookAuthor;

    @ManyToOne
    private Categories bookCategory;

    @ManyToOne
    private Publishers bookPublisher;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public Book(String title, String author, Authors bookAuthor, Categories bookCategory, Publishers bookPublisher) {
        this.title = title;
        this.author = author;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookPublisher = bookPublisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Authors getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Authors bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Categories getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(Categories bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Publishers getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(Publishers bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
}
