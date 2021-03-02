package com.reto2.api.Web.View;

import com.reto2.api.Services.ProductsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("products")
public class ProductsViewController {
   
    private final ProductsService productsService;

    ProductsViewController(ProductsService productsService) {
        this.productsService = productsService;
    }
}
