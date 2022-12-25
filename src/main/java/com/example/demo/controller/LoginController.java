package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.services.LoginService;

@RestController
public class LoginController {
    
    @Autowired
    LoginService loginService;

    @PostMapping("/product/addProduct")
    public ResponseEntity<String>  addProduct(@RequestBody Product product) {
        loginService.addProductService(product);
        return new ResponseEntity<>("success",HttpStatus.CREATED);
    }

    @GetMapping("/product/showProducts")
    public ResponseEntity<List<Product>> fetchAllProduct() {
        return new ResponseEntity<>(loginService.fetchAllProductService(),HttpStatus.OK);
    }

    
}
