package com.reto2.api.Web.API;

import com.reto2.api.Services.OrderProductsService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/orderproducts")
public class OrderProductsController {

    private final OrderProductsService orderProductsService;

    OrderProductsController(OrderProductsService orderProductsService) {
        this.orderProductsService = orderProductsService;
    }    
}