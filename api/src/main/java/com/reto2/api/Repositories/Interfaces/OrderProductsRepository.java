package com.reto2.api.Repositories.Interfaces;

import java.util.Collection;

import com.reto2.api.Repositories.Entities.OrderProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderProductsRepository
    extends JpaRepository<OrderProductEntity, Long>{
        @Query(value = "SELECT p FROM Products p INNER JOIN OrderProducts op ON op.idProduct = p.id WHERE op.idOrder = :id")
        Collection<OrderProductEntity> findByOrderProducts(@Param("id") Long id); 
}