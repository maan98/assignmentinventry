package com.dxc.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.consumer.model.Item;
import com.dxc.consumer.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@GetMapping("/items/{id}/{qty}")
	public Item getItem(@PathVariable int id,@PathVariable int qty) {
		return service.getData(id,qty);
	}

}
