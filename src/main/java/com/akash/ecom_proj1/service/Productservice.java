package com.akash.ecom_proj1.service;

import com.akash.ecom_proj1.model.Product;
import com.akash.ecom_proj1.repo.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productservice {

    @Autowired
    private Productrepo repo;

    public List<Product> getallproducts(){
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

}
