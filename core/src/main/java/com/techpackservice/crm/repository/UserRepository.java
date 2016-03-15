package com.techpackservice.crm.repository;


import com.techpackservice.crm.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
