package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.Interfaces.ShopsService;
import com.sda.springstarter.demo.model.Shops;
import com.sda.springstarter.demo.repository.ShopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ShopServiceImpl implements ShopsService {

    @Autowired
    ShopsRepository shopsRepository;

    @Override
    public List<Shops> getAllShops() {
        return shopsRepository.findAll();
    }

    @Override
    public void addShop(Shops shop) {
        shopsRepository.save(shop);
    }
}
