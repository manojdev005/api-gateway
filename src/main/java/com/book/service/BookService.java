package com.book.service;

import com.book.model.Book;
import com.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return null;
    }

    public Book createBook(Book book) {
        return null;
    }
}
