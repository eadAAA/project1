package kz.bcc.bookCatalog.service;

import kz.bcc.bookCatalog.model.Book;

public interface BookInformationService {

    Book getBookInformationById(Long id);
}
