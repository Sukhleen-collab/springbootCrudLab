package com.example.SpringBootCrudLab.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.SpringBootCrudLab.Entity.Book;



public interface BookRepository extends MongoRepository<Book, Integer>{



}