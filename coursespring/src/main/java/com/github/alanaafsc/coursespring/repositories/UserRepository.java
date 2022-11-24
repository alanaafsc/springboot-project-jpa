package com.github.alanaafsc.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.alanaafsc.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
