package com.graph.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graph.graphql.entities.User;
import com.graph.graphql.repository.UserRepository;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class Mutation implements GraphQLMutationResolver {

    private final UserRepository userRepository;

    public User newUser(Long id, String name, String lastname, String username, String password) {

        User user = new User();
        user.setLastname(lastname);
        user.setName(name);
        user.setPassword(password);
        user.setUsername(username);
        user.setId(id);
        return userRepository.save(user);
    }

    public boolean deleteUser(Long id) {

        userRepository.deleteById(id);
        return true;
    }

}