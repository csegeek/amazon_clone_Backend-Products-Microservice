package com.example.amazon_clone_backend.Repository;

import java.math.BigInteger;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.amazon_clone_backend.Entity.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product,BigInteger> {
    public Product findByproductID(UUID productId);
}
