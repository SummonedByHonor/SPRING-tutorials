package com.sda.springstarter.demo.Interfaces;

import com.sda.springstarter.demo.model.Shops;

import java.util.List;

public interface ShopsService {

    List<Shops> getAllShops();
    void addShop(Shops shop);
}
