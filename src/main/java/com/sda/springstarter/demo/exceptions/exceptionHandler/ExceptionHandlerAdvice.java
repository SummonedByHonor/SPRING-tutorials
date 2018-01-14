package com.sda.springstarter.demo.exceptions.exceptionHandler;

import com.sda.springstarter.demo.exceptions.ApiError;
import com.sda.springstarter.demo.exceptions.AuthorNotFoundException;
import com.sda.springstarter.demo.exceptions.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity handleException(BookNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu", "Błąd"));
    }

    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity handleException(AuthorNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiError(HttpStatus.NOT_FOUND,
                "Nie znaleziono Autora", "Błąd"));
    }
}
