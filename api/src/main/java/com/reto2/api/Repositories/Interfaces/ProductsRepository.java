package com.reto2.api.Repositories.Interfaces;

import com.reto2.api.Repositories.Entities.ProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository
    extends JpaRepository<ProductEntity, Long>{
        
}