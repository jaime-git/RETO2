package com.reto2.api.Services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.reto2.api.Repositories.Entities.OrderEntity;
import com.reto2.api.Repositories.Interfaces.OrdersRepository;
import com.reto2.api.Services.Models.OrderDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<OrderDTO> EntitiesToDTO(Collection<OrderEntity> list){
        return list.stream()
        .map(x -> modelMapper.map(x, OrderDTO.class))
        .collect(Collectors.toList());
    }
    //MOSTRAR TODOS LOS PEDIDOS
    public List<OrderDTO> getAll(){
            return EntitiesToDTO(ordersRepository.findAll());
    }    
    
}