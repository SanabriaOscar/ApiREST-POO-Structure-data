package com.example.testjulian.controller;
import org.springframework.web.bind.annotation.*;
import com.example.testjulian.model.Product;
import com.example.testjulian.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoServiceImpl productoService;

    @GetMapping("/products")
    public List<Product>listar(){
        return productoService.ListAllProduct();
    }

    @PostMapping("/products/add")
    public  String save(@RequestBody Product product){
        productoService.SaveProduct(product);
        return "product saved";
    }

    @GetMapping("/products/{id}")

    public Product listBYID( @PathVariable Integer id){
        return    productoService.findById(id);

    }

    @PutMapping("/products/edit/{id}")
    public Product edit(@RequestBody Product product, @PathVariable Integer id)
    {
        Product productEdit=productoService.findById(id);
        productEdit.setName(product.getName());
        productoService.SaveProduct(productEdit);
        return productEdit;
    }

    @GetMapping("/products/delete{id}")

    public String delete( @PathVariable Integer id){
            productoService.deleteProduct(id);
        return "product delete";
    }

}
