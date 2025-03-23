package com.example.ex_1_1.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDao {

    private ConnectionMaker connectionMaker;

    public void setConnectionMaker(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public UserDao(ConnectionMaker connectionMaker){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        this.connectionMaker = context.getBean("connectionMaker",ConnectionMaker.class);
    }

}
