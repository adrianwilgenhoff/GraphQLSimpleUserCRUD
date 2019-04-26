package com.graph.graphql.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graph.graphql.entities.User;
import com.graph.graphql.repository.UserRepository;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class Query implements GraphQLQueryResolver {

    private final UserRepository userRepository;

    public List<User> users() {
        return userRepository.findAll();
    }

}