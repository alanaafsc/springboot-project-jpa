package com.github.alanaafsc.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.alanaafsc.coursespring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
