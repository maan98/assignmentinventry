package com.dxc.producer.service;

import java.util.List;

import com.dxc.producer.model.Item;

public interface InventoryService {

	public Item getAllItem(int id);

	public Item getItemById(int id,int qty);

}
