package com.ffucks.service;

import com.ffucks.entities.User;
import com.ffucks.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void save(User user) {
        repository.save(user.getId(), user);
    }

    public User get(String id) {
        return (User) repository.findById(id);
    }
}