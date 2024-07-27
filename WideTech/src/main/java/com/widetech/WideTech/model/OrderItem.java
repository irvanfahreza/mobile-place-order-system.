package com.widetech.WideTech.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String customerName;
    
    private String customerAddress;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonIgnore
    private Product product;
    
    private Double price;
    
    private Double quantity;
    
    private Double total;

	public Long getId() {
		return id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public Product getProduct() {
		return product;
	}

	public Double getPrice() {
		return price;
	}

	public Double getQuantity() {
		return quantity;
	}

	public Double getTotal() {
		return total;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
    

    
    
}
