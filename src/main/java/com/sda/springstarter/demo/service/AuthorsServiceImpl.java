package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.Interfaces.AuthorsService;
import com.sda.springstarter.demo.exceptions.AuthorNotFoundException;
import com.sda.springstarter.demo.model.Authors;
import com.sda.springstarter.demo.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Authors getAuthorById(int id) {
        Optional<Authors> authorsOptional = authorsRepository.findById(id);
        if (authorsOptional.isPresent()) {
            return authorsOptional.get();
        } else {
            throw new AuthorNotFoundException(id);
        }
    }
}
