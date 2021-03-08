package com.reto2.api.Services.Models;

import com.reto2.api.Repositories.Entities.OrderEntity;
import com.reto2.api.Repositories.Entities.ProductEntity;

public class OrderProductDTO {
    
    private Long id;
    private int quantity;

    public OrderEntity orderEntity;
    public ProductEntity productEntity;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public OrderEntity getOrderEntity() { return orderEntity; }
    public void setOrderEntity(OrderEntity orderEntity) { this.orderEntity = orderEntity; }

    public ProductEntity getProductEntity() { return productEntity; }
    public void setProductEntity(ProductEntity productEntity) { this.productEntity = productEntity; }

}