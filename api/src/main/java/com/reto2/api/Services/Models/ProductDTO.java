package com.reto2.api.Services.Models;

public class ProductDTO {
    
    private Long id;
    private String name;
    private double price;
    private String url;

    public Long getid() { return id; }
    public void setid(Long id) { this.id = id;}

    public String getName() { return name; }
    public void setName(String name) { this.name = name;}

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price;}

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url;}

}
