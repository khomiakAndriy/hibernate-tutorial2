package com.hibernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller
public class HomeController {

//    @Autowired
//    private DataSource myDataSource;

    @RequestMapping("/")
    public String home(){
//
//        try {
//            Connection connection = myDataSource.getConnection();
//            System.out.println("Succsessful connection");
//        } catch (SQLException e) {
//            System.out.println("Connection failed");
//        }

        return "home";
    }
}
