package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorsRepository extends JpaRepository<Authors, Long> {

    Authors findById(int id);

    Authors findByName(String name);
}
