package com.kjzy.mybatisplus;


import com.kjzy.mybatisplus.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {

        System.out.println(bookDao.selectList(null));
        System.out.println("==========================>>>>>>>");
        System.out.println(bookDao.selectById(2));
    }

}
