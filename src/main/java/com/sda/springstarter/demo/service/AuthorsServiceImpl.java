package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.Interfaces.AuthorsService;
import com.sda.springstarter.demo.model.Authors;
import com.sda.springstarter.demo.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsServiceImpl implements AuthorsService {

    @Autowired
    AuthorsRepository authorsRepository;


    @Override
    public List<Authors> getAllAuthors() {
        return authorsRepository.findAll();
    }

    @Override
    public void addAuthor(Authors author) {
        authorsRepository.save(author);
    }

}
