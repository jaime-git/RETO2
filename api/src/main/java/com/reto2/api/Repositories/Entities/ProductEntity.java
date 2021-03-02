package com.reto2.api.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Products")
@Entity(name = "Products")
public class ProductEntity {
    
    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long id;
    private String name;
    private double price;
    private String url;

    public ProductEntity(){
    }

    public ProductEntity(String _name, double _price, String _url){
        this.name = _name;
        this.price = _price;
        this.url = _url;
    }

    public Long getid() { return id; }
    public void setid(Long id) { this.id = id;}

    public String getName() { return name; }
    public void setName(String name) { this.name = name;}

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price;}

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url;}
 
}
