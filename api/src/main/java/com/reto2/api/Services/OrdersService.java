package com.reto2.api.Services;

import com.reto2.api.Repositories.Interfaces.OrdersRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private ModelMapper modelMapper;
}