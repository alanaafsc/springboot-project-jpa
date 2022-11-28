package com.github.alanaafsc.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.alanaafsc.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
