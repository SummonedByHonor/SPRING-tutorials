package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Authors;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Categories;
import com.sda.springstarter.demo.service.AuthorsServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.CategoriesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookRestController {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private AuthorsServiceImpl authorsService;

    @Autowired
    private CategoriesServiceImpl categoriesService;

    @RequestMapping(value = "getBookList", method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(value = "/addNewBook", method = RequestMethod.POST)
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    @RequestMapping(value = "/getAuthorList", method = RequestMethod.GET)
    public List<Authors> getAllAuthors() {
        return authorsService.getAllAuthors();
    }

    @RequestMapping(value = "/getCategoryList", method = RequestMethod.GET)
    public List<Categories> getAllCategories() {
        return categoriesService.getAllCategories();
    }

    @RequestMapping(value = "/addNewAuthor", method = RequestMethod.POST)
    public void saveAuthor(@RequestBody Authors author){
        authorsService.addAuthor(author);
    }

    @RequestMapping(value = "/addNewCategory", method = RequestMethod.POST)
    public void saveCategory(@RequestBody Categories category){
        categoriesService.addCategory(category);
    }

    @GetMapping(value = "/getBookById/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getBookById(id));
    }
}
