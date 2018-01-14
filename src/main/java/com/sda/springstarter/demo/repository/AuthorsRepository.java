package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Authors, Long> {

    Optional<Authors> findById(int id);

    Authors findByName(String name);
}
