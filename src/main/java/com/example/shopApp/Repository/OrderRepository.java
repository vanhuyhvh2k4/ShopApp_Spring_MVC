package com.example.shopApp.Repository;

import com.example.shopApp.Entity.Account;
import com.example.shopApp.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}