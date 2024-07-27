package com.widetech.WideTech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.widetech.WideTech.config.Response;
import com.widetech.WideTech.model.OrderItem;
import com.widetech.WideTech.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/list")
	public List<OrderItem> getListOrderItem(){
		return orderService.getListOrderItem();
	}
	
	@PostMapping("/save")
	public ResponseEntity<Response> saveOrder(@RequestBody List<OrderItem> item) {
		orderService.saveOrder(item);
        return ResponseEntity.ok(new Response("Berhasil Membuat Pesanan"));
	}
}
