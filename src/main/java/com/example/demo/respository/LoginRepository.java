package com.example.demo.respository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;


@Repository
@Component
public interface LoginRepository extends JpaRepository<Product,String>{
    
    // Product save(Product product);

    // ArrayList<Product> findAll();

}
