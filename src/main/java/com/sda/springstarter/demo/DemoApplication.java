package com.sda.springstarter.demo;

import com.sda.springstarter.demo.Interfaces.OpinionsService;
import com.sda.springstarter.demo.Interfaces.ShopsService;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Opinions;
import com.sda.springstarter.demo.model.Shops;
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

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Book bookOne = Book.builder().title("Tytuł1").author("Autor1").build();
//        Book bookTwo = Book.builder().title("Tytuł2").author("Autor2").build();

        Book bookOne = new Book("Tytuł1", "Autor1");
        Book bookTwo = new Book("Tytuł2", "Autor2");

        bookService.saveBook(bookOne);
        bookService.saveBook(bookTwo);

        Shops bigShop = new Shops("Duży Sklep", "Wielka", "Warszawa");
        Shops smallShop = new Shops("Mały Sklepik", "Kręta", "Sosnowiec");

        shopsService.addShop(bigShop);
        shopsService.addShop(smallShop);

        Opinions opinionOne = new Opinions(0, "Adam", "Dobra książka.Polecam");
        Opinions opinionTwo = new Opinions(1, "CichoSza", "Nudna lektura, nie czytajcie!");

        opinionsService.addOpinion(opinionOne);
        opinionsService.addOpinion(opinionTwo);
    }
}
