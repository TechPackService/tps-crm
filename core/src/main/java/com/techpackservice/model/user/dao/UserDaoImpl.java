package com.techpackservice.model.user.dao;

import com.techpackservice.model.user.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public User saveOrUpdate(User user) {
        getSession().saveOrUpdate(user);
        return user;
    }


    public User findById(Class<User> entityType, Long id) {
        User entity = (User) getSession().get(entityType, id);

        if (entity == null) {
            throw new EntityNotFoundException("нет такой энтити");
        }

        return entity;
    }
}
