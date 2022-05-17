package com.example.testjulian.service;

import com.example.testjulian.model.Product;
import com.example.testjulian.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements IProductService{

    @Autowired
     private ProductRepository productRepository;

    @Override
    public List<Product> ListAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void SaveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteProduct(int id) {
            productRepository.deleteById(id);
    }
}
