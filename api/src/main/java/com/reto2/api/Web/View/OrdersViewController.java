package com.reto2.api.Web.View;

import com.reto2.api.Services.OrdersService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("orders")
public class OrdersViewController {
    
    private final OrdersService ordersService;

    OrdersViewController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

}
