package com.github.alanaafsc.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.alanaafsc.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
