package com.reto2.api.Web.View;

import com.reto2.api.Services.ProductsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("products")
public class ProductsViewController {
   
    private final ProductsService productsService;

    ProductsViewController(ProductsService productsService) {
        this.productsService = productsService;
    }

    //MOSTRAR LISTA DE PRODUCTOS
    @GetMapping
    public ModelAndView products(){
       ModelAndView modelo = new ModelAndView("index");
       modelo.addObject("products", productsService.getAll());
       return modelo;
   }
}
