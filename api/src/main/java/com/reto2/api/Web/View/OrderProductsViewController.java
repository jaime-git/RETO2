package com.reto2.api.Web.View;

import com.reto2.api.Services.OrderProductsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("orderProducts")
public class OrderProductsViewController {
    
    private final OrderProductsService orderProductsService;

    OrderProductsViewController(OrderProductsService orderProductsService) {
        this.orderProductsService = orderProductsService;
    } 

}
