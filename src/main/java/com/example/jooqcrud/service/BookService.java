package com.example.jooqcrud.service;

import com.example.jooqcrud.Repository.BookRepository;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookServiceInterface {
    @Autowired
    private BookRepository bookRepository;


    @Override
    public void insertBook(Book book) {
        bookRepository.insert(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getBooks();
    }

    @Override
    public List<Book> getBookByID(int ID) {
        return bookRepository.getByID(ID);
    }

    @Override
    public String deleteBook(int ID) {
        bookRepository.deleteBook(ID);
        return "Book Deleted";
    }

    @Override
    public void updateBook(Book book) {
    }
}