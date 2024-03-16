package com.cn.cnkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cnkart.dal.ItemDetailsDAL;

@Service
public class ItemDetailsService {
	
	@Autowired
	ItemDetailsDAL itemDetailsDAL;
	
	public void delete(int id) {
		itemDetailsDAL.delete(id);
	}

}
