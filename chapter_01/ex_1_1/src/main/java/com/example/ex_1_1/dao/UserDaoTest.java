package com.example.ex_1_1.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);

        UserDao dao3 = context.getBean("userDao3", UserDao.class);
        UserDao dao4 = context.getBean("userDao4", UserDao.class);

        System.out.println(dao3);
        System.out.println(dao4);

        ConnectionMaker connectionMaker = new DConnectionMaker();

//        UserDao dao = new DaoFactory().userDao();
    }
}
