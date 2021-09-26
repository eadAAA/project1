package com.example.demo.controller;

import com.example.demo.model.BookDTO;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addBook(@RequestParam int isbn, @RequestParam String name, String description){
        bookService.addBook(isbn, name, description);

    }
    @GetMapping
    public BookDTO getBook(@RequestParam int isbn){
        return bookService.getBook(isbn);
    }
}
