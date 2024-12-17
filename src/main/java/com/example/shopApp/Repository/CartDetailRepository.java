package com.example.shopApp.Repository;

import com.example.shopApp.Entity.Account;
import com.example.shopApp.Entity.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
}