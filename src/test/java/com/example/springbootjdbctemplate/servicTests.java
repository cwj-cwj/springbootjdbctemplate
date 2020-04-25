package com.example.springbootjdbctemplate;

import com.example.springbootjdbctemplate.model.Book;
import com.example.springbootjdbctemplate.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/*单元测试*/
@RunWith(SpringRunner.class)
@SpringBootTest
class servicTests {
    @Autowired
    BookService bookService;
    @Test
    void contextLoads() {
        List<Book> bs=bookService.getAllBooks();
        System.out.println(bs.size());
    }

}
