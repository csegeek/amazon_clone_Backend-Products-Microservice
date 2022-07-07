package com.example.amazon_clone_backend.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazon_clone_backend.Entity.Product;
import com.example.amazon_clone_backend.Service.ProductService;

@RestController
@RequestMapping("/amazon/products")

public class ProductController {
     @Autowired
     ProductService productService;
    @PostMapping("/save")
    public Product saveData(@RequestBody Product product){
        return this.productService.saveDataToDB(product);
    }
    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct(){
       return this.productService.findAllProducts();
    }
    //53485706-ccf8-4562-b657-742b6b731d34
    //74ebf773-e0a5-4477-bd97-0212dc9e5eff
    @GetMapping("/getById/{productID}")
    public Product getById(@PathVariable UUID productID){
    //   Product prod=this.productService.getProductDetails(productID);
    //     System.out.println(prod);
        return this.productService.getProductDetails(productID);
        
    }

}
