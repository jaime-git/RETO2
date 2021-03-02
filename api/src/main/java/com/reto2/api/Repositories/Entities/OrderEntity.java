package com.reto2.api.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Orders")
@Entity(name = "Orders")
public class OrderEntity {

    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long id;
    private String date;
    private String nameUser;
    private String status;
    
    public OrderEntity(){
    }

    public OrderEntity(String _date, String _nameUser, String _status){
        this.date = _date;
        this.nameUser = _nameUser;
        this.status = _status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id;}

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date;}

    public String getNameUser() { return nameUser; }
    public void setNameUser(String nameUser) { this.nameUser = nameUser;}
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status;} 
}
