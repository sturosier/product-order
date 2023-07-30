package com.steventech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders-api")
public class ProductOrderController {

    @GetMapping("/orders")
    public String getAllOrders()
    {
        return "all orders";
    }
}
