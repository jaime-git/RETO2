package com.reto2.api.Web.API;

import java.util.List;

import com.reto2.api.Services.OrderProductsService;
import com.reto2.api.Services.Models.OrderProductDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/orderproducts")
public class OrderProductsController {

    private final OrderProductsService orderProductsService;

    OrderProductsController(OrderProductsService orderProductsService) {
        this.orderProductsService = orderProductsService;
    }    

    @GetMapping()
    public List<OrderProductDTO> GetMovies(){
        return orderProductsService.getAll();
    }

    @GetMapping("/{id}")
    public List<OrderProductDTO> Get(@PathVariable("id") Long id){
        return orderProductsService.findProductsByOrder(id);
    }

    //Anadir pelicula
    @PostMapping
    public OrderProductDTO AddOP(@RequestBody OrderProductDTO op){
        return orderProductsService.add(op);
    }

    //Actualizar pelicula
    @PutMapping("/{id}")
    public OrderProductDTO UpdateOP(@RequestBody OrderProductDTO op, @PathVariable("id") Long id){
        return orderProductsService.update(id, op);
    }

    //Eliminar pelicula
    @DeleteMapping("/{id}")
    public void DeleteOP(@PathVariable("id") Long id){
        orderProductsService.delete(id);
    }
}