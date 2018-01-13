package com.sda.springstarter.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "Autorzy")
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String adress;


    private String name;


    private String lastname;

    @OneToMany(mappedBy = "bookAuthor", cascade = CascadeType.ALL)
    private Set<Book> setOfBooks;



    public Authors(String name, String adress, String lastname, Set<Book> setOfBooks) {
        this.name = name;
        this.adress = adress;
        this.lastname = lastname;
        this.setOfBooks = setOfBooks;
    }

    public String getAdress() {
        return adress;
    }

    public Authors() {
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
