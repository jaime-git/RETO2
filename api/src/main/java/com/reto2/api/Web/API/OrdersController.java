package com.reto2.api.Web.API;

import com.reto2.api.Services.OrdersService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/orders")
public class OrdersController {

    private final OrdersService ordersService;

    OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

}