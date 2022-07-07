package com.example.amazon_clone_backend.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amazon_clone_backend.Entity.Product;
import com.example.amazon_clone_backend.Repository.ProductRepo;

@Service
public class ProductService {
  @Autowired
  ProductRepo productRepo;
   
    public Product saveDataToDB(Product product){
        product.setProductID(UUID.randomUUID());
        return productRepo.save(product);
    }

    public List<Product> findAllProducts(){
    return productRepo.findAll();
    }
  
    public Product getProductDetails(UUID productId){
        return productRepo.findByproductID(productId);
        
    }


}
