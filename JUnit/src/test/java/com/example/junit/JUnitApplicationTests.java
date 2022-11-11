package com.example.junit;

import com.example.junit.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class JUnitApplicationTests {
    @Autowired
private BookDao bookDao;
    @Test
    void contextLoads() {
    bookDao.save();
    }

}
