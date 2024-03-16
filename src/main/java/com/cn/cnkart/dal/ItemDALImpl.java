package com.cn.cnkart.dal;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.cnkart.entity.Item;

import jakarta.persistence.EntityManager;

@Repository
public class ItemDALImpl implements ItemDAL {
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public Item getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Item item=session.get(Item.class, id);
		return item;
		
	}

	@Override
	public void save(Item item) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(item);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Item item = session.get(Item.class,id);
		session.remove(item);
		
	}

	@Override
	public void update(Item updateItem) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Item currentItem = session.get(Item.class, updateItem.getId());
		currentItem.setDescription(updateItem.getDescription());
		currentItem.setName(updateItem.getName());
		session.update(currentItem);
		
	}

	

	

	
	
	

}
