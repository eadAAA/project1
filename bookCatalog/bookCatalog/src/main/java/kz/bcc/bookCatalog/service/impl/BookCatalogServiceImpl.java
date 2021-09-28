package kz.bcc.bookCatalog.service.impl;

import kz.bcc.bookCatalog.model.Book;
import kz.bcc.bookCatalog.service.BookCatalogService;
import kz.bcc.bookCatalog.service.BookInformationService;
import kz.bcc.bookCatalog.service.BookRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookCatalogServiceImpl implements BookCatalogService {

    @Autowired
    private BookInformationService bookInformationService;
    @Autowired
    private BookRatingService bookRatingService;

    @Override
    public List<Book> getAllBooks() {
        List<Book> bookList = new ArrayList<>();

        List<Long> bookIds = new ArrayList<>(Arrays.asList(1L, 2L, 4L));
        for (Long id : bookIds) {
            Book book = bookInformationService.getBookInformationById(id);
            Double rating = bookRatingService.getBookRatingById(id);
            book.setRating(rating);
            bookList.add(book);
        }

        return bookList;
    }
}
