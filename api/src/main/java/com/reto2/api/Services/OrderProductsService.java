package com.reto2.api.Services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
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

    public List<OrderProductDTO> EntitiesOrderProduct(Collection<OrderProductEntity> list){
        return list.stream()
        .map(x -> modelMapper.map(x, OrderProductDTO.class))
        .collect(Collectors.toList());
    }

    //MOSTRAR TODOS LOS PEDIDOS
    public List<OrderProductDTO> getAll(){
        return EntitiesOrderProduct(orderProductsRepository.findAll());
    } 

    //ENCONTRAR 
    public List<OrderProductDTO> findProductsByOrder(Long id){
        return EntitiesOrderProduct(orderProductsRepository.findByOrderProducts(id));
    }

    //ANADIR OP
    public OrderProductDTO add(OrderProductDTO op){
        OrderProductEntity entityToInsert = modelMapper.map(op, OrderProductEntity.class);
        OrderProductEntity result = orderProductsRepository.save(entityToInsert);
        return modelMapper.map(result, OrderProductDTO.class);
    }

    //ACTUALIZAR OP
    public OrderProductDTO update(Long ID, OrderProductDTO op){
        OrderProductEntity entityToUpdate = modelMapper.map(op, OrderProductEntity.class);
        entityToUpdate.setId(ID);
        OrderProductEntity result = orderProductsRepository.save(entityToUpdate);
        return modelMapper.map(result, OrderProductDTO.class);
    }

    //ELIMINAR OP
    public void delete(Long ID){
        Optional<OrderProductEntity> entityToDelete = orderProductsRepository.findById(ID);
        if (entityToDelete.isPresent())
        orderProductsRepository.delete(entityToDelete.get());
    }
}