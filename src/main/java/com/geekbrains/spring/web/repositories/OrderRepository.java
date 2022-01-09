package com.geekbrains.spring.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekbrains.spring.web.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}
