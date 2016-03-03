package com.techpackservice.model.user.dao;

import com.techpackservice.model.user.User;

/**
 * Created by Asus on 3/3/2016.
 */
public interface UserDao {

    User saveOrUpdate(User user);

    User findById(Class<User> entityType, Long id);
}
