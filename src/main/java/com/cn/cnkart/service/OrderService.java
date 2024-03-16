package com.cn.cnkart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cnkart.dal.ItemDAL;
import com.cn.cnkart.dal.OrderDAL;
import com.cn.cnkart.entity.Item;
import com.cn.cnkart.entity.Order;

import jakarta.transaction.Transactional;

@Service
public class OrderService {
	
	@Autowired
	OrderDAL orderDAL;
	
	@Autowired
	ItemDAL itemDAL;
    
	@Transactional
	public Order getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderDAL.getOrderById(id);
	}
    
	
	@Transactional
	public void saveOrder(Order order) {
		
		Order saveOrder = new Order();
		saveOrder.setOrderType(order.getOrderType());
		
		List<Item> itemList=new ArrayList<>();
		
		for(Item item:order.getItems()) {
			Item currentItem=itemDAL.getById(item.getId());
			itemList.add(currentItem);
			}
		saveOrder.setItems(itemList);
		orderDAL.save(saveOrder);
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		orderDAL.delete(id);
		
	}

}
