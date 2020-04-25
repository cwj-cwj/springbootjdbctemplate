package com.example.springbootjdbctemplate;

import com.example.springbootjdbctemplate.service.BookService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class controllertest {
    @Autowired
    BookService bookService;
    /*模拟servletContext 的环境*/
    @Autowired
    WebApplicationContext wac;
    MockMvc  mockMvc;
    @Before
    public void before(){
        mockMvc=MockMvcBuilders.webAppContextSetup(wac).build();
    }
}
