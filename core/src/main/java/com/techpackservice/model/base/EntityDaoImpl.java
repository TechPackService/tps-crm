package com.techpackservice.model.base;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class EntityDaoImpl<T extends BaseEntity> implements EntityDao <T> {

    private Class<T> entityClass;

    @Autowired
    private SessionFactory sessionFactory;

    public EntityDaoImpl() {
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        entityClass = (Class) type.getActualTypeArguments()[0];
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected Criteria createCriteria() {
        return getSession().createCriteria(entityClass);
    }

    @Override
    public T findById(Long id) {
        Assert.notNull(id);
        return getSession().get(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        return createCriteria().list();
    }
}
