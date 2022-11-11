package com.example.druid.dao;

import com.example.druid.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Bookdao {
//    @Select("select * from books where id =#{id}")
//    public Book getById(Integer id);
    @Select("insert into books  (name, author_id)values ('我是人才', 12 )")
    List<Book> getAll();

}
