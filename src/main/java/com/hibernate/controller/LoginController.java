package com.hibernate.controller;

import com.hibernate.auth.User;
import com.hibernate.service.UserService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "logout";
    }

    @RequestMapping("/newaccount")
    public String newaccount(Model model) {
        model.addAttribute("user", new User());
        return "newaccount";
    }


    @RequestMapping(value = "/createaccount", method = RequestMethod.POST)
    public String createAccount(@Valid @ModelAttribute("user") User user, BindingResult result) {

        if (result.hasErrors()) {
            return "newaccount";
        }

        user.setEnabled(true);
        user.setAuthority("ROLE_USER");

        if (userService.userExists(user.getUsername())){
            result.rejectValue("username", "DublicateKey.user.username", "This username already exists!");
            return "newaccount";
        }

//        Exception validation
//        try {
//            userService.create(user);
//        } catch (ConstraintViolationException e) {
//            result.rejectValue("username", "DublicateKey.user.username", "This username already exists!");
//            return "newaccount";
//        }

        userService.create(user);
        return "accountcreated";
    }

}
