package com.example.shopApp.Repository;

import com.example.shopApp.Entity.Account;
import com.example.shopApp.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}