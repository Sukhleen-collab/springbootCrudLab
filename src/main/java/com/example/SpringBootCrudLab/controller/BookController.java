package com.example.SpringBootCrudLab.controller;

import java.util.Collection;

import com.example.SpringBootCrudLab.Entity.Book;
import com.example.SpringBootCrudLab.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public Collection<Book> getBooks()
    {
        return (bookService.getBooks());
    }

    @PostMapping()
    public Book postBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

}
