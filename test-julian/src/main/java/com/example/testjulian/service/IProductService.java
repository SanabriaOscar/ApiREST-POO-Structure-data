package com.example.testjulian.service;

import com.example.testjulian.model.Product;

import java.util.List;

public interface IProductService {
   List<Product> ListAllProduct();
   void SaveProduct(Product product);
   Product findById(int id);
   void deleteProduct(int id);
}
