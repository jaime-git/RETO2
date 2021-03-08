package com.reto2.api.Web.API;

import java.util.List;

import com.reto2.api.Services.ProductsService;
import com.reto2.api.Services.Models.ProductDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/products")
public class ProductsController {

    private final ProductsService productsService;

    ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    //Devolver todos los productos
    @GetMapping()
    public List<ProductDTO> GetProducts(){
        return productsService.getAll();
    }
}
