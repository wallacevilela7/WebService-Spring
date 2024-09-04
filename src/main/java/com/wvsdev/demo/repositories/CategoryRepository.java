package com.wvsdev.demo.repositories;

import com.wvsdev.demo.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
