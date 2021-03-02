package com.reto2.api.Services;

import com.reto2.api.Repositories.Interfaces.OrderProductsRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderProductsService {
    @Autowired
    private OrderProductsRepository orderProductsRepository;
    @Autowired
    private ModelMapper modelMapper;
}