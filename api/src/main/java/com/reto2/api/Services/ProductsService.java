package com.reto2.api.Services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.reto2.api.Repositories.Entities.ProductEntity;
import com.reto2.api.Repositories.Interfaces.ProductsRepository;
import com.reto2.api.Services.Models.ProductDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDTO> EntitiesProduct(Collection<ProductEntity> list){
        return list.stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }

    //MOSTRAR TODOS LOS PRODUCTOS
    public List<ProductDTO> getAll(){
        return EntitiesProduct(productsRepository.findAll());
    }
    
}