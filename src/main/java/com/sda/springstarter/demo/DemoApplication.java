package com.sda.springstarter.demo;

import com.sda.springstarter.demo.Interfaces.OpinionsService;
import com.sda.springstarter.demo.Interfaces.ShopsService;
import com.sda.springstarter.demo.model.Authors;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Categories;
import com.sda.springstarter.demo.model.Publishers;
import com.sda.springstarter.demo.repository.AuthorsRepository;
import com.sda.springstarter.demo.service.AuthorsServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.CategoriesServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private OpinionsService opinionsService;

    @Autowired
    private ShopsService shopsService;

    @Autowired
    private AuthorsServiceImpl authorsService;

    @Autowired
    private CategoriesServiceImpl categoriesService;

    @Autowired
    private PublisherServiceImpl publisherService;

    @Autowired
    private AuthorsRepository authorsRepository;

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Book bookOne = new Book("Strona", "");
        Authors author = authorsRepository.findById(1);
        Categories category = categoriesService.getCategoryById(2);
        Publishers publisher = publisherService.getPublisherById(1);
        bookOne.setBookAuthor(author);
        bookOne.setBookCategory(category);
        bookOne.setBookPublisher(publisher);


        bookService.saveBook(bookOne);
    }
}
