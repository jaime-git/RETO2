package com.reto2.api.Repositories.Interfaces;

import com.reto2.api.Repositories.Entities.OrderEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository
    extends JpaRepository<OrderEntity, Long>{
        
}