package kz.bcc.bookCatalog.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import kz.bcc.bookCatalog.service.BookRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookRatingServiceImpl implements BookRatingService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "getBookRatingByIdFallback")
    public Double getBookRatingById(Long id) {
        return restTemplate.getForObject("http://book-rating-service/book/rating/" + id, Double.class);
    }

    public Double getBookRatingByIdFallback(Long id) {
        return 0.0;
    }
}
