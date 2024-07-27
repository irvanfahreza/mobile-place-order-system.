package com.widetech.WideTech.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.widetech.WideTech.config.Response;
import com.widetech.WideTech.model.Product;
import com.widetech.WideTech.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public Page<Product> getListProduct(Pageable pageable){
		return productService.getListProduct(pageable);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id){
		Optional<Product> product = productService.getProducyById(id);
		return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Response> deleteProduct(@PathVariable Long id){
		productService.deleteProduct(id);
		return ResponseEntity.ok(new Response("Berhasil hapus product"));
	}
}
