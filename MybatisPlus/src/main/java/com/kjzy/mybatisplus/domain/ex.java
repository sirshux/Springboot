package com.kjzy.mybatisplus.domain;

import org.springframework.aop.ThrowsAdvice;

import java.sql.SQLSyntaxErrorException;

public class ex implements ThrowsAdvice {
    public void A(SQLSyntaxErrorException exe){
        System.out.println("SQLSyntaxErrorException");

    }
}
