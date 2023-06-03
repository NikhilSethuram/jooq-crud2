package com.example.jooqcrud.service;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;

import java.util.List;

public interface BookServiceInterface {
    public void insertBook(Book book);

    public List<Book> getAllBooks();

    public List<Book> getBookByID(int ID);

    public String deleteBook(int ID);

    public void updateBook(Book book);

}
