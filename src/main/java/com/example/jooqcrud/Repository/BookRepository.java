package com.example.jooqcrud.Repository;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    private DSLContext dslContext;


    public void insert(Book book){
        dslContext.insertInto(Tables.BOOK,Tables.BOOK.ID,Tables.BOOK.AUTHOR,Tables.BOOK.TITLE)
                .values(book.getId(),book.getAuthor(), book.getTitle())
                .execute();
    }
    public List<Book> getBooks(){
        return dslContext.selectFrom(Tables.BOOK).fetchInto(Book.class);
    }
    public List<Book> getByID(int ID){
        return dslContext.select().from(Tables.BOOK).where(Tables.BOOK.ID.equal(ID))
                .fetchInto(Book.class);
    }

    public boolean deleteBook(int toFindID){
        return dslContext.deleteFrom(Tables.BOOK).where(Tables.BOOK.ID.equal(toFindID)).execute() >= 1;
    }

    public void updateBook(Book book){

    }


}
