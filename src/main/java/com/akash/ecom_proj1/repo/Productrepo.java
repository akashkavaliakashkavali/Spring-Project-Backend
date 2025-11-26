package com.akash.ecom_proj1.repo;

import com.akash.ecom_proj1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepo extends JpaRepository<Product, Integer> {
}
