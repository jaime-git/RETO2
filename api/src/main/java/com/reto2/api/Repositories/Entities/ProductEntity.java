package com.reto2.api.Repositories.Entities;

public class ProductEntity {
    
    private static int counterProduct = 0;

    public ProductEntity(){
        setIdProduct(counterProduct++);
    }

    public ProductEntity(String _name, double _price, String _url){
        this.idProduct = counterProduct++;
        this.name = _name;
        this.price = _price;
        this.url = _url;
    }

    private int idProduct;
    public int getIdProduct() { return idProduct; }
    public void setIdProduct(int idProduct) { this.idProduct = idProduct;}

    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name;}

    private double price;
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price;}

    private String url;
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url;}
 
}
