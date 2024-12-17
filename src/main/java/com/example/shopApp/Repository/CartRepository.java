package com.example.shopApp.Repository;

import com.example.shopApp.Entity.Account;
import com.example.shopApp.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}