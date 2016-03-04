package com.techpackservice.service.user;

import com.techpackservice.model.user.User;
import com.techpackservice.model.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
