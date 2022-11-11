package com.example.mybatis;

import com.example.mybatis.dao.a;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisApplicationTests {
    @Autowired
    private a bookDao;
    @Test
    void contextLoads() {
        System.out.println(bookDao.getAll());

    }

}
