package com.reto2.api.Repositories.Interfaces;

import com.reto2.api.Repositories.Entities.OrderProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductsRepository
    extends JpaRepository<OrderProductEntity, Long>{
        
}