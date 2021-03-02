package com.reto2.api.Services.Models;

public class OrderDTO {
    
    private Long id;
    private String date;
    private String nameUser;
    private String status;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id;}

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date;}

    public String getNameUser() { return nameUser; }
    public void setNameUser(String nameUser) { this.nameUser = nameUser;}
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status;}

}