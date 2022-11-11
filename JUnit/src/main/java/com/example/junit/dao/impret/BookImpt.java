package com.example.junit.dao.impret;

import com.example.junit.dao.BookDao;
import org.springframework.stereotype.Controller;

@Controller
public class BookImpt implements BookDao {
    @Override
    public void save(){
        System.out.println("这是一个测试类");
    }

}
