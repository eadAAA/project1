package com.example.demo.service.impl;

import com.example.demo.model.BookDTO;
import com.example.demo.service.BookService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookServiceMemoryImpl implements BookService {

    private Map<Integer, BookDTO> persist = new HashMap<>();

    @Override
    public void addBook(int isbn, String name, String description) {
        persist.put(isbn, new BookDTO(isbn, name, description));
    }

    @Override
    public BookDTO getBook(int isbn) {
        return persist.get(isbn);
    }
}
