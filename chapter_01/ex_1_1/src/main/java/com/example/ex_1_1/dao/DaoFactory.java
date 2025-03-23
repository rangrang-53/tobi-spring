package com.example.ex_1_1.dao;

import org.springframework.context.annotation.Bean;

public class DaoFactory {

    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setConnectionMaker(connectionMaker());
        return userDao;
    }
}
