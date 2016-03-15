package com.techpackservice.crm.service;

import com.techpackservice.crm.entity.User;

public interface UserService {

    User save(User user);
    //for test purposes
    Iterable<User> findAll();

}
