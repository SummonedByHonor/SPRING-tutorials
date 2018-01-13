package com.sda.springstarter.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Wydawnictwa")
public class Publishers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String adress;

    private String name;

    @OneToMany(mappedBy = "bookPublisher")
    private Set<Book> book;

    public Publishers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setBook(Set<Book> book) {
        this.book = book;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Publishers(String adress, String name, Set<Book> book) {
        this.adress = adress;
        this.name = name;
        this.book = book;
    }
}
