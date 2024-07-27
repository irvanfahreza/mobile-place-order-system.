package com.widetech.WideTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.widetech.WideTech.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
