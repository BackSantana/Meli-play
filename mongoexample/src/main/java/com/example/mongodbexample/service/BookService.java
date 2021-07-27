package com.example.mongodbexample.service;

import com.example.mongodbexample.domain.Book;
import com.example.mongodbexample.repository.BookRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
