package com.techpackservice.controller;

import com.techpackservice.model.user.User;
import com.techpackservice.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * for test purposes
 * */
@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public ModelAndView test() {
        List<User> users = userService.findAll();
        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("users", users);
        return modelAndView;
    }
}
