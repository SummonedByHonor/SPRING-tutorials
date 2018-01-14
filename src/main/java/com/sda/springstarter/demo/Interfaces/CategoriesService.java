package com.sda.springstarter.demo.Interfaces;

import com.sda.springstarter.demo.model.Categories;
import com.sda.springstarter.demo.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriesService {


    List<Categories> getAllCategories();

    void addCategory(Categories category);


}
