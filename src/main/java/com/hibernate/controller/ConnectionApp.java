package com.hibernate.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionApp {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3307/hibernate_db?useSSL=false";
        String user = "login";
        String pass = "password";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection successful!!!");

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
