package com.sda.springstarter.demo.exceptions;

public class AuthorNotFoundException extends RuntimeException {

    public AuthorNotFoundException(int id) {
        System.out.println("Author not found with id " + id);
    }
}
