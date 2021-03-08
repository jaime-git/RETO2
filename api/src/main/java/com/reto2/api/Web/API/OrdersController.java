package com.reto2.api.Web.API;

import java.util.List;

import com.reto2.api.Services.OrdersService;
import com.reto2.api.Services.Models.OrderDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/orders")
public class OrdersController {

    private final OrdersService ordersService;

    OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    //Devolver todos los pedidos
    @GetMapping()
    public List<OrderDTO> GetOrders(){
        return ordersService.getAll();
    }

}