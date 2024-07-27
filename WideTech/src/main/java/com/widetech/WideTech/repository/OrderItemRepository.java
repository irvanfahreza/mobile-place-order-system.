package com.widetech.WideTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.widetech.WideTech.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
