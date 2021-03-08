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
    private int quantity;

    private Long idOrder;
    private Long idProduct;

    public OrderProductEntity(){
    }

    public OrderProductEntity(Long _idOrder, Long _idProduct, int _quantity){
        this.idOrder = _idOrder;
        this.idProduct = _idProduct;
        this.quantity = _quantity;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Long getIdOrder() { return idOrder; }
    public void setIdOrder(Long idOrder) { this.idOrder = idOrder; }

    public Long getIdProduct() { return idProduct; }
    public void setIdProduct(Long idProduct) { this.idProduct = idProduct; }
 
}
