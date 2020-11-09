package com.dxc.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dxc.consumer.model.Item;

@FeignClient(name="invantory")
public interface OrderService {
	
	@GetMapping("/items/{id}/{qty}")
	public Item getData(@PathVariable int id,@PathVariable int qty);

}
