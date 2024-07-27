package com.widetech.WideTech.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.widetech.WideTech.model.Product;
import com.widetech.WideTech.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public Page<Product> getListProduct(Pageable pageable){
		return productRepo.findAll(pageable);
	}
	
	public Optional<Product> getProducyById(Long id){
		return productRepo.findById(id);
	}
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	
	public void deleteProduct(Long id) {
		productRepo.deleteById(id);
	}
}
