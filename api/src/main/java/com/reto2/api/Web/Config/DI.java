package com.reto2.api.Web.Config;

import com.reto2.api.Services.OrderProductsService;
import com.reto2.api.Services.OrdersService;
import com.reto2.api.Services.ProductsService;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DI {
    @Bean
    ProductsService createProductsService(){
        return new ProductsService();
    }

    @Bean
    OrdersService createOrdersService(){
        return new OrdersService();
    }

    @Bean
    OrderProductsService createOrderProductsService(){
        return new OrderProductsService();
    }
    
    @Bean
    ModelMapper createModelMapper(){
        return new ModelMapper();
    }
}
