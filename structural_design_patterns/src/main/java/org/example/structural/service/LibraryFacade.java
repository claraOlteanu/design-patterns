package org.example.structural.service;

import org.example.structural.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibraryFacade {
    @Autowired
    private BookService bookService;

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public List<Book> getFeaturedBooks() {
        return bookService.getAllBooks();
    }
}