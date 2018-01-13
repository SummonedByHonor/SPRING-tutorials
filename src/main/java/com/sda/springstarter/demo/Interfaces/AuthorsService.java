package com.sda.springstarter.demo.Interfaces;

import com.sda.springstarter.demo.model.Authors;
import com.sda.springstarter.demo.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AuthorsService {


    List<Authors> getAllAuthors();

    void addAuthor(Authors author);
}
