package com.hibernate.controller;

import com.hibernate.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/newaccount")
    public String newaccount(Model model){
        model.addAttribute("user", new User());
        return "newaccount";
    }

    @RequestMapping("/createaccount")
    public String createAccount(){
        return "accountcreated";
    }

}
