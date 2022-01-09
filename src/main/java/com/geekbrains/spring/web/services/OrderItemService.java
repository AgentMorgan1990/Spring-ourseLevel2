package com.geekbrains.spring.web.services;

import org.springframework.stereotype.Service;

import com.geekbrains.spring.web.entities.OrderItem;
import com.geekbrains.spring.web.repositories.OrderItemRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;

    public OrderItem save(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }
}
