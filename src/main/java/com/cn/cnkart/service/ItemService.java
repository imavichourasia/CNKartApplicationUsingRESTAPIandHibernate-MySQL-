package com.cn.cnkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cnkart.dal.ItemDAL;
import com.cn.cnkart.entity.Item;

import jakarta.transaction.Transactional;

@Service
public class ItemService {
    
	
	@Autowired
	ItemDAL itemDAL;
	@Transactional
	public Item getItemById(int id) {
		
		return itemDAL.getById(id);
		
	}
	
	@Transactional
	public void saveItem(Item item) {
		itemDAL.save(item);
		
	}
    
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		itemDAL.delete(id);
		
	}
	
	
    @Transactional
	public void update(Item updateItem) {
		// TODO Auto-generated method stub
		itemDAL.update(updateItem);
		
	}

}
