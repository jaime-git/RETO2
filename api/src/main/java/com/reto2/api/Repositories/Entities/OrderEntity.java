package com.reto2.api.Repositories.Entities;

public class OrderEntity {
    private static int counterOrder = 0;
    
    public OrderEntity(){
        setIdOrder(counterOrder++);
    }

    public OrderEntity(String _date, String _name_user, String _status){
        this.idOrder = counterOrder++;
        this.date = _date;
        this.name_user = _name_user;
        this.status = _status;
    }

    private int idOrder;
    public int getIdOrder() { return idOrder; }
    public void setIdOrder(int idOrder) { this.idOrder = idOrder;}

    private String date;
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date;}

    private String name_user;
    public String getName_user() { return name_user; }
    public void setName_user(String name_user) { this.name_user = name_user;}

    private String status;
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status;} 
    
}
