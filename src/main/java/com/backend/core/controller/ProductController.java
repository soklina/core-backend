package com.backend.core.controller;

import com.backend.core.model.product.ProductEntity;
import com.backend.core.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sok Lina
 * Date     : 2/2/2021, 7:38 AM
 * Email    : lina.sok@prasac.com.kh
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductEntity>> getAllProduct() {
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity < ProductEntity > getProductById(@PathVariable long id) {
        return ResponseEntity.ok().body(productService.getProductById(id));
    }

    @PostMapping("/products")
    public ResponseEntity < ProductEntity > createProduct(@RequestBody ProductEntity product) {
        return ResponseEntity.ok().body(this.productService.createProduct(product));
    }

    @PutMapping("/products/{id}")
    public ResponseEntity < ProductEntity > updateProduct(@PathVariable long id, @RequestBody ProductEntity product) {
        product.setId(id);
        return ResponseEntity.ok().body(this.productService.updateProduct(product));
    }

    @DeleteMapping("/products/{id}")
    public HttpStatus deleteProduct(@PathVariable long id) {
        this.productService.deleteProduct(id);
        return HttpStatus.OK;
    }

}
