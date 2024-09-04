package com.wvsdev.demo.repositories;

import com.wvsdev.demo.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}