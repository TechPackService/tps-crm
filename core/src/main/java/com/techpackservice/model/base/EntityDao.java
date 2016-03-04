package com.techpackservice.model.base;

import java.util.List;

public interface EntityDao <T extends BaseEntity> {

    T findById(Long id);

    List<T> findAll();
}
