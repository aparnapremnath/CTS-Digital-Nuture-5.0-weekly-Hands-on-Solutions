package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookTitle) {
        System.out.println("[BookService] addBook() called.");
        bookRepository.save(bookTitle);
        System.out.println("[BookService] Book added successfully: " + bookTitle);
    }

    public void getBook(int id) {
        System.out.println("[BookService] getBook() called.");
        String book = bookRepository.findById(id);
        System.out.println("[BookService] Found: " + book);
    }
}