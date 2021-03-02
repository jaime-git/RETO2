package com.reto2.api.Repositories.Entities;

public class OrderProductEntity {
    public OrderEntity order;
    public ProductEntity product;
    private static int counterOP = 0;

    public OrderProductEntity(){
        setIdOP(counterOP++);
    }

    public OrderProductEntity(ProductEntity _product, OrderEntity _order, int _cuantity){
        this.idOP = counterOP++;
        this.order = _order;
        this.product = _product;
        this.cuantity = _cuantity;
    }

    private int idOP;
    public int getIdOP() { return idOP; }
    public void setIdOP(int idOP) { this.idOP = idOP; }

    private int cuantity;
    public int getCuantity() { return cuantity; }
    public void setCuantity(int cuantity) { this.cuantity = cuantity; }

    public OrderEntity getOrder() { return order; }

    public void setOrder(OrderEntity order) { this.order = order; }

    public ProductEntity getProduct() { return product; }

    public void setProduct(ProductEntity product) { this.product = product; }
 
    
}
