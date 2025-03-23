package com.example.ex_1_1.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    public static Connection makeConnection() throws ClassNotFoundException,
            SQLException;
}
