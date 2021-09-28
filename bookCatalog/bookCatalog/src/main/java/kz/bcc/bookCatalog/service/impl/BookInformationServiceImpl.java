package kz.bcc.bookCatalog.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import kz.bcc.bookCatalog.model.Book;
import kz.bcc.bookCatalog.service.BookInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookInformationServiceImpl implements BookInformationService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "getBookInformationByIdFallback")
    public Book getBookInformationById(Long id) {
        return restTemplate.getForObject("http://book-information-service/books/" + id, Book.class);
    }

    public Book getBookInformationByIdFallback(Long id) {
        Book book = new Book();
        book.setId(0L);
        book.setTitle("Title is not available: Service Unavailable");
        return book;
    }
}
