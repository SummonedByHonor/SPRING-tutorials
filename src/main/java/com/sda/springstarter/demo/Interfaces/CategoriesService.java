package com.sda.springstarter.demo.Interfaces;

import com.sda.springstarter.demo.model.Categories;

import java.util.List;

public interface CategoriesService {

    List<Categories> getAllCategories();

    void addCategory(Categories category);


}
