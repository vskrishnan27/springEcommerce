package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService productService;

    @GetMapping({"/","/hello"})
    public String hello() {
        return "hello";
    }

    @PostMapping("/product/addProduct")
    public ResponseEntity<String>  addProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.addProductService(product),HttpStatus.CREATED);
    }

    @PutMapping("/product/updateStock")
    public ResponseEntity<String>  updateStock(@RequestParam int stock,@RequestParam Long id) {
        return new ResponseEntity<>(productService.updateStocks(stock,id),HttpStatus.CREATED);
    }

    @DeleteMapping("/product/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        return new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);
    }


    @GetMapping("/product/showProducts")
    public ResponseEntity<List<Product>> fetchAllProduct() {
        List<Product> listOfProducts = productService.fetchAllProductService();
        return new ResponseEntity<>(listOfProducts,HttpStatus.OK);
    }

    
}
