package com.sda.springstarter.demo.exceptions;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(int id) {
        super("Book not found with id " + id);
    }
}
