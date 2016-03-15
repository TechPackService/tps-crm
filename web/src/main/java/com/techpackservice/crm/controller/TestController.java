package com.techpackservice.crm.controller;

import com.techpackservice.crm.entity.User;
import com.techpackservice.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/test", method = {RequestMethod.POST, RequestMethod.GET})
    public String test(Model model, User user) {
        System.out.println(user);
        if (user.getLogin() != null && user.getPassword() != null) {
            userService.save(user);
        }
        Iterable<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "test";
    }

}
