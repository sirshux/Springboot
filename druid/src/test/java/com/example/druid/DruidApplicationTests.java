package com.example.druid;


import com.example.druid.dao.Bookdao;
import com.example.druid.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DruidApplicationTests {
@Autowired
private Bookdao bookdao;
    @Test
    void contextLoads() {
        System.out.println(bookdao.getAll());
    }

}
