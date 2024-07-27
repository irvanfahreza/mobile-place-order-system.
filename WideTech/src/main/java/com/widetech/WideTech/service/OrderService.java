package com.widetech.WideTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widetech.WideTech.model.OrderItem;
import com.widetech.WideTech.repository.OrderItemRepository;

@Service
public class OrderService {

	@Autowired
	private OrderItemRepository orderRepo;
	
	public List<OrderItem> getListOrderItem(){
		return orderRepo.findAll();
	}
	
	public List<OrderItem> saveOrder(List<OrderItem> orderItem) {
		for (OrderItem item : orderItem) {
            item.setTotal(item.getQuantity() * item.getPrice());
        }
		return orderRepo.saveAll(orderItem);
	}
}
