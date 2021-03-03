package com.reto2.api.Services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.reto2.api.Repositories.Entities.OrderProductEntity;
import com.reto2.api.Repositories.Interfaces.OrderProductsRepository;
import com.reto2.api.Services.Models.OrderProductDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderProductsService {
    @Autowired
    private OrderProductsRepository orderProductsRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<OrderProductDTO> EntitiesToDTO(Collection<OrderProductEntity> list){
        return list.stream()
        .map(x -> modelMapper.map(x, OrderProductDTO.class))
        .collect(Collectors.toList());
    }
}