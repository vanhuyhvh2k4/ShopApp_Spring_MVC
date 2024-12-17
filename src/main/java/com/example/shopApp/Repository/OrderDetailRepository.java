package com.example.shopApp.Repository;

import com.example.shopApp.Entity.Account;
import com.example.shopApp.Entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}