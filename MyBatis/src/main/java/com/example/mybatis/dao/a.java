package com.example.mybatis.dao;

import com.example.mybatis.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface a {
//    @Select("select * from books where id =#{id}")
//    public Book getById(Integer id);

    @Select("select * from books where name='如何征服英俊少男'")
    List<Book> getAll();


}
