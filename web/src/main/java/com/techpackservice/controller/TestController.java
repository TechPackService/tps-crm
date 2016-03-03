package com.techpackservice.controller;

import com.techpackservice.model.user.User;
import com.techpackservice.model.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/test")
    public String test() {
        User user = new User();
        user.setName("testName");
        userDao.saveOrUpdate(user);
        System.out.println(userDao.findById(User.class, 1L));
        System.out.println(userDao.findById(User.class, 2L));
        System.out.println(userDao.findById(User.class, 3L));
        System.out.println(userDao.findById(User.class, 4L));
        return "test";
    }
}
