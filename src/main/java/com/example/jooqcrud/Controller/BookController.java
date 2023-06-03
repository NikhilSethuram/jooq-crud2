package com.example.jooqcrud.Controller;

import com.example.jooqcrud.service.BookService;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/books")
    public class BookController {
        @Autowired
        private BookService service;

        @PostMapping
        public String addBook(@RequestBody Book book){
            service.insertBook(book);
            return "Book added.";
        }

        @GetMapping
        public List<Book> getBooks(){
            return service.getAllBooks();
        }

        @RequestMapping("/getID")
        public List<Book> getEmployeeByID(@RequestParam int ID){
            return service.getBookByID(ID);
        }

        @DeleteMapping
        public String deleteEmployee(@RequestParam int ID){
             service.deleteBook(ID);
             return "Book deleted.";
        }


}
