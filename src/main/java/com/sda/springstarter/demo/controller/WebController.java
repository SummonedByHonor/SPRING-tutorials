package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.AuthorsServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.CategoriesServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private PublisherServiceImpl publisherService;

    @Autowired
    private CategoriesServiceImpl categoriesService;

    @Autowired
    private AuthorsServiceImpl authorsService;

    @GetMapping
    public ModelAndView showBooks(){
        ModelAndView model = new ModelAndView();
        model.addObject("booklister", bookService.getAllBooks());
        model.setViewName("booklist");
        model.addObject("publisherlister", publisherService.getAllPublishers());
        model.addObject("categorieslister", categoriesService.getAllCategories());
        model.addObject("authorlister", authorsService.getAllAuthors());
        model.addObject("book", new Book());
        return model;
    }

//    @GetMapping
//    public ModelAndView showPublishers(){
//        ModelAndView model = new ModelAndView();
//        model.addObject("publisherlister", publisherService.getAllPublishers());
//        model.setViewName("publisher");
//        return model;
//    }
}
