package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.Interfaces.CategoriesService;
import com.sda.springstarter.demo.model.Categories;
import com.sda.springstarter.demo.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    CategoriesRepository categoriesRepository;

    @Override
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public void addCategory(Categories category) {
        categoriesRepository.save(category);
    }
}
