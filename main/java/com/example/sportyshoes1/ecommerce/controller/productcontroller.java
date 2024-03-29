package com.example.sportyshoes1.ecommerce.controller;



import com.sportyshoes.ecommerce.model.Product;
import com.sportyshoes.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

    @RestController
    @CrossOrigin
    @RequestMapping("/api/products")
    public class ProductController {

        private ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @GetMapping(value = { "", "/" })
        public @NotNull Iterable<Product> getProducts() {
            return productService.getAllProducts();
        }
    }
}
