package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

// import org.hibernate.type.TrueFalseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.respository.LoginRepository;

@Service
@Component
public class LoginService {
    
    @Autowired
    private LoginRepository loginRepository;

    public void addProductService(Product product){
        loginRepository.save(product);

        // System.out.println(product.getProductName());


    }

    public List<Product> fetchAllProductService(){
        // return loginRepository.findAll();
        return new ArrayList<>();
    }

}
