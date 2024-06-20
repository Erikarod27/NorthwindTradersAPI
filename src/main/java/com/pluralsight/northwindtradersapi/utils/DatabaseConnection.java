package com.pluralsight.northwindtradersapi.utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String url = "jdbc:mysql://localhost:3306/northwind";
    private static final String user = "root";
    private static final String password = "password";

    static {
        try {
            //DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind");
            DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to load MySQL JDBC driver", e);
        }
    }

    public static Connection getConnection()  throws SQLException {
        return DriverManager.getConnection(url, user, password);

    }
}
