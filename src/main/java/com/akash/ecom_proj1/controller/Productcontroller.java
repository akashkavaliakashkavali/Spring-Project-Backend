package com.akash.ecom_proj1.controller;


import com.akash.ecom_proj1.model.Product;
import com.akash.ecom_proj1.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Productcontroller {

    @Autowired
    private Productservice service;


    @GetMapping ("/products")
    public ResponseEntity <List<Product>> getallproducts(){
        return new ResponseEntity<>(service.getallproducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {

        Product product = service.getProductById(id);

        if(product != null)
            return new ResponseEntity<>(product, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    

}
