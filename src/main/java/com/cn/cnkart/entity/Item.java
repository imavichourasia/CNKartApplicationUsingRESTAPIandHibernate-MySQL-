//package com.cn.cnkart.entity;
//
//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="item")
//public class Item {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column
//	private int id;
//	
//	@Column 
//	private String name;
//	
//	@Column
//	private String description;
//	
//	@OneToOne(cascade=CascadeType.ALL)
//	private itemDetails itemDetails;
//	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="item_id")
//////	@JsonManagedReference
//	private List<ItemReview> itemReview;
//	
//	public itemDetails getItemDetails() {
//		return itemDetails;
//	}
//	
//	public void setItemDetails(itemDetails itemDetails) {
//		this.itemDetails=itemDetails;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public List<ItemReview> getItemReview() {
//		return itemReview;
//	}
//
//	public void setItemReview(List<ItemReview> itemReview) {
//		this.itemReview = itemReview;
//	}
//	
//	
//	
//	
//
//}
package com.cn.cnkart.entity;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL)
	private itemDetails itemDetails;
	
	@OneToMany(mappedBy= "item",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<ItemReview> itemReview;
	
	@ManyToMany(mappedBy="items")
	@JsonIgnore
	private List<Order> orders;
	
	public List<ItemReview> getItemReview() {
		return itemReview;
	}
	public void setItemReview(List<ItemReview> itemReview) {
		this.itemReview = itemReview;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public itemDetails getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(itemDetails itemDetails) {
		this.itemDetails = itemDetails;
	}

}
