package com.reto2.api.Services;

import com.reto2.api.Repositories.Interfaces.ProductsRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private ModelMapper modelMapper;
}