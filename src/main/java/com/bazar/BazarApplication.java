package com.bazar;

import com.bazar.Entity.Product;
import com.bazar.Repository.ProductRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BazarApplication {

    public static void main(String[] args) {
        SpringApplication.run(BazarApplication.class, args);
    }

    @Bean
    ApplicationRunner init(ProductRepository productRepository) {
        return p -> {
            Stream.of("Taska", "Auto", "Dum").forEach(
                    name -> {
                        productRepository.save(new Product(name));
                    });
        };
    }
}


