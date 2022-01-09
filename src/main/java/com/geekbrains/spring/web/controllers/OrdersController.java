package com.geekbrains.spring.web.controllers;

import org.springframework.web.bind.annotation.*;

import com.geekbrains.spring.web.entities.Order;
import com.geekbrains.spring.web.services.OrderService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrdersController {
    private final OrderService orderService;

    @GetMapping()
    public void createOrder(@RequestParam(name = "address") String address,
                            @RequestParam(name = "phone") String phone,
                            @RequestParam(name = "user_name") String userName) {
        orderService.createOrder(address, phone, userName);
    }
}
