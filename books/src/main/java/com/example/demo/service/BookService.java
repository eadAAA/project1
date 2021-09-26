package com.example.demo.service;

import com.example.demo.model.BookDTO;

public interface BookService {
    void addBook(int isbn, String name, String description);
    BookDTO getBook(int isbn);
}
