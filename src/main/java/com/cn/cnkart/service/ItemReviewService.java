//package com.cn.cnkart.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cn.cnkart.dal.ItemReviewDAL;
//import com.cn.cnkart.entity.ItemReview;
//
//import jakarta.transaction.Transactional;
//
//
//@Service
//public class ItemReviewService {
//	
//	
//	@Autowired
//	ItemReviewDAL itemReviewDAL;
//    
//	
//	@Transactional
//	public void save(ItemReview review) {
//		// TODO Auto-generated method stub
//		itemReviewDAL.save(review);
//		
//		
//	}
//
//
//	
//
//}
package com.cn.cnkart.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cnkart.dal.ItemReviewDAL;
import com.cn.cnkart.entity.ItemReview;

import jakarta.transaction.Transactional;

@Service
public class ItemReviewService {

	@Autowired
	ItemReviewDAL itemReviewDAL;
	
	@Transactional
	public void save(ItemReview review) {
		itemReviewDAL.save(review);
		
	}


}

