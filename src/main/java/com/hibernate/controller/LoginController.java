package com.hibernate.controller;

import com.hibernate.auth.User;
import com.hibernate.entity.Offer;
import com.hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/newaccount")
    public String newaccount(Model model){
        model.addAttribute("user", new User());
        return "newaccount";
    }


    @RequestMapping(value = "/createaccount", method = RequestMethod.POST)
    public String createAccount(@ModelAttribute("user") User user) {

        user.setEnabled(true);
        user.setAuthority("ROLE_USER");
        userService.create(user);

        return "offercreated";
    }

}
