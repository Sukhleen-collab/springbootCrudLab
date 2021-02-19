package com.example.SpringBootCrudLab.DAO;

import java.util.Collection;

import com.example.SpringBootCrudLab.Entity.Book;
import com.example.SpringBootCrudLab.Entity.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookDAO {


    @Autowired
    private BookRepository repository;

    public Collection<Book> getBooks()
    {
        return repository.findAll();
    }

    public Book createBook(Book book) {
        return repository.insert(book);
    }
}
