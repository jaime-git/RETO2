package com.reto2.api.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "OrderProducts")
@Entity(name = "OrderProducts")
public class OrderProductEntity {

    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long id;
    private int cuantity;

    public OrderEntity orderId;
    public ProductEntity productId;

    public OrderProductEntity(){
    }

    public OrderProductEntity(ProductEntity _productId, OrderEntity _orderId, int _cuantity){
        this.orderId = _orderId;
        this.productId = _productId;
        this.cuantity = _cuantity;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getCuantity() { return cuantity; }
    public void setCuantity(int cuantity) { this.cuantity = cuantity; }

    public OrderEntity getOrderId() { return orderId; }
    public void setOrderId(OrderEntity orderId) { this.orderId = orderId; }

    public ProductEntity getProductId() { return productId; }
    public void setProductId(ProductEntity productId) { this.productId = productId; }
 
}
