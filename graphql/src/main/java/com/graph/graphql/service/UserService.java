package com.graph.graphql.service;

import java.util.List;

import com.graph.graphql.entities.User;
import com.graph.graphql.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User creatUser(User user) {
        return userRepository.save(user);
    }
}