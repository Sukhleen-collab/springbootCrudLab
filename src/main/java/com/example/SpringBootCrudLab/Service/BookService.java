package com.example.SpringBootCrudLab.Service;
import java.util.Collection;

import com.example.SpringBootCrudLab.DAO.BookDAO;
import com.example.SpringBootCrudLab.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getBooks()
    {
        return bookDAO.getBooks();
    }

    public Book createBook(Book book) {

        return bookDAO.createBook(book) ;
    }



}
