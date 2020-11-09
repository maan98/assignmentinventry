package com.dxc.producer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.producer.model.Item;

@Repository
public interface InventoryRepository extends JpaRepository<Item, Integer>{

}
