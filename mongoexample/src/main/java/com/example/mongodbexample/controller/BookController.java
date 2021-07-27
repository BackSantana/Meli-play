package com.example.mongodbexample.controller;

import com.example.mongodbexample.domain.Book;
import com.example.mongodbexample.service.BookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mongoexample")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/books")
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }
}
