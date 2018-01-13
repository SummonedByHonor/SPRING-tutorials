package com.sda.springstarter.demo;

import com.sda.springstarter.demo.Interfaces.OpinionsService;
import com.sda.springstarter.demo.Interfaces.ShopsService;
import com.sda.springstarter.demo.model.Authors;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.repository.AuthorsRepository;
import com.sda.springstarter.demo.service.AuthorsServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
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
    private AuthorsRepository authorsRepository;

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Book bookOne = new Book("Tytuł1", "Autor1");
//        Book bookTwo = new Book("Tytuł2", "Autor2");
//
//        Shops bigShop = new Shops("Duży Sklep", "Wielka", "Warszawa");
//        Shops smallShop = new Shops("Mały Sklepik", "Kręta", "Sosnowiec");
//
//        shopsService.addShop(bigShop);
//        shopsService.addShop(smallShop);
//
//        Opinions opinionOne = new Opinions(bookOne, "Adam", "Dobra książka.Polecam");
//        Opinions opinionTwo = new Opinions(bookTwo, "CichoSza", "Nudna lektura, nie czytajcie!");
//
//        opinionsService.addOpinion(opinionOne);
//        opinionsService.addOpinion(opinionTwo);

        Book bookOne = new Book("Strona", "");
        Authors author = authorsRepository.findById(1);
        bookOne.setBookAuthor(author);

        bookService.saveBook(bookOne);
    }
}
