package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

// import org.hibernate.type.TrueFalseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.respository.ProductRepository;

@Service
@Component
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    
    public String addProductService(Product product){ //to add product 
        try {
            productRepository.save(product);
            return "SUCCESS";
        } catch (Exception e) {
            // TODO: handle all exception
            return "SOMETHING WENT WRONG";
        }

        
    }

    public List<Product> fetchAllProductService(){ // fetch all the products form db service
        try {
            return productRepository.findAll();
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
        
    }

    public String updateStocks(int stock,Long id){ // to update the stock it will increase the int stock value 
        try {
            productRepository.updateStock(stock, id);
            return "SUCCESS";
        } catch (Exception e) {
            // TODO: handle all exception
            return "something went wrong";
        }
        
    }

    public String deleteProduct(Long id){ // delete product from db
       
        try {
            productRepository.deleteById(id);
            return "SUCCES";
        }
        catch(EmptyResultDataAccessException e){
            return "no user associated with this id";
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            return "something went wrong";
        }
       
        
    }



}
