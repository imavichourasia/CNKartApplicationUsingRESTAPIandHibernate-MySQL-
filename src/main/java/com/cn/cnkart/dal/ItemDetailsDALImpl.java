package com.cn.cnkart.dal;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.cnkart.entity.itemDetails;

import jakarta.persistence.EntityManager;

@Repository
public class ItemDetailsDALImpl implements ItemDetailsDAL{
	
	
	
	@Autowired
	EntityManager entityManager;

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		Session session = entityManager.unwrap(Session.class);
		itemDetails itemDetails=session.get(itemDetails.class, id);
		session.delete(itemDetails);
		
	}

}
