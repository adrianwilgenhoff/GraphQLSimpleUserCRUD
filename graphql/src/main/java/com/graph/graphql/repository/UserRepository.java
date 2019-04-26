package com.graph.graphql.repository;

import com.graph.graphql.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}