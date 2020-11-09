package com.dxc.producer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.producer.model.Item;
import com.dxc.producer.repository.InventoryRepository;
@Service
public class InventoryServiceImp implements InventoryService{

	
	@Autowired
	InventoryRepository repo;
	@Override
	public Item getAllItem(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Item getItemById(int id,int qty) {
		// TODO Auto-generated method stub
		Item itm=repo.findById(id).get();
		itm.setQty(itm.getQty()-qty);
		repo.save(itm);
		return itm;
	}

}
