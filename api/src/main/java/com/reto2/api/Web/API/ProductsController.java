package com.reto2.api.Web.API;

import com.reto2.api.Services.ProductsService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/products")
public class ProductsController {

    private final ProductsService productsService;

    ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }
}
