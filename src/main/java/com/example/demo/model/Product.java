package com.example.demo.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="products")
@Component
public class Product {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;
    private String productName;
    private int price,stock;
    public Product() {
    }
    public Product(String productName, String productId, int price, int stock) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.stock = stock;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
