package com.example.springbootjdbctemplate.controller;

import com.example.springbootjdbctemplate.model.Book;
import com.example.springbootjdbctemplate.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/bookOps")
    public void BookOps(){
        Book b1=new Book();
        b1.setName("西湘记");
        b1.setAuthor("王实普");
        int i=bookService.addBook(b1);
        System.out.println("addBook>>>"+i);


    }
}
