package com.example.mybatis.domain;

public class Book {
    private String name;
    private int author_id;

    @Override
    public String toString() {
        return "Book{" +
                ", name='" + name + '\'' +
                ", author_id=" + author_id +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }
}
