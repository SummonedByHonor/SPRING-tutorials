package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

    Categories findById(int id);
}
