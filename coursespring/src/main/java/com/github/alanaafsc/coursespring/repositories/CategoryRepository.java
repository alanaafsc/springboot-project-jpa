package com.github.alanaafsc.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.alanaafsc.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
