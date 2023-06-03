package com.example.jooqcrud.Repository;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;

import java.util.List;

public interface BookRepositoryInterface {
    public void insert(Book book);
    public List<Book> getAll();
    public List<Book> getByID(int ID);
    public boolean deleteBook(int ID);
    public void updateBook(Book book);
}
