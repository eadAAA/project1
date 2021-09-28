package kz.bcc.bookCatalog.controller;

import kz.bcc.bookCatalog.service.BookCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class BookController {

    @Autowired
    private BookCatalogService bookCatalogService;


    @GetMapping("/books")
    public ResponseEntity<?> getAllBooks() {
        return ResponseEntity.ok(bookCatalogService.getAllBooks());
    }
}
