package com.sda.springstarter.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Sklepy")
public class Shops {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String street;

    private String city;

    public Shops(String name, String street, String city) {
        this.name = name;
        this.street = street;
        this.city = city;
    }
}
