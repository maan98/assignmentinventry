package com.dxc.producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.producer.model.Item;
import com.dxc.producer.service.InventoryService;

@RestController
public class InventoryController {
	
	@Autowired
	InventoryService service;
	@GetMapping("/items/{id}")
	public Item getItem(@PathVariable int id) {
		return service.getAllItem(id);
	}
	@GetMapping("/items/{id}/{qty}")
	public Item getItemById(@PathVariable int id,@PathVariable int qty) {
		return service.getItemById(id,qty);
	}

}
