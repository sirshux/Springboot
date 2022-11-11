package com.kjzy.mybatisplus.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kjzy.mybatisplus.domain.Books;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Books> {
//    @Select("select * from books where id =#{id}")
//    public Book getById(Integer id);
//    @Select("select * from books")
//    List<Book> getAll();

}
