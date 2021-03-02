package com.reto2.api.Web.Config;

import com.reto2.api.Repositories.Entities.OrderEntity;
import com.reto2.api.Repositories.Entities.ProductEntity;
import com.reto2.api.Repositories.Interfaces.OrdersRepository;
import com.reto2.api.Repositories.Interfaces.ProductsRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(ProductsRepository Prepository, OrdersRepository Orepository){
        return args -> {
            /* Prepository.deleteAll(); */
            Prepository.save(new ProductEntity("Pantalon Nike", 24.90,"https://www.zalando.es/nike-performance-dry-pant-pantalones-deportivos-n1243e0ja-k11.html"));
            Prepository.save(new ProductEntity("Chaqueta Nike", 49.95,"https://www.zalando.es/nike-sportswear-windrunner-chaqueta-de-entrenamiento-game-royal-ni124k00f-k11.html"));
            Prepository.save(new ProductEntity("Zapatillas Nike", 71.95,"https://www.zalando.es/nike-sportswear-air-max-270-zapatillas-ni114d07i-q12.html"));
            Prepository.save(new ProductEntity("Chandal adidas", 43.95,"https://www.zalando.es/adidas-originals-set-unisex-pantalones-blackblue-ad126d05o-q11.html"));

            Orepository.save(new OrderEntity("15:53","Jamius","En curso"));
            Orepository.save(new OrderEntity("12:00","Dabidovick","Enviado"));
            Orepository.save(new OrderEntity("21:30","Pablo Motos","Cancelado"));
            
        };
    }
}