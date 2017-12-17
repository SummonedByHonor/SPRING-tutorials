package com.sda.springstarter.demo.Interfaces;

import com.sda.springstarter.demo.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    void saveBook(Book book);

}
