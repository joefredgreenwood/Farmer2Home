package com.mastek.farmToShop.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Products {
	
	public Products() {
		// TODO Auto-generated constructor stub
	}
	
	int productID;
	String productName;
	int productQuantity;
	float productPrice;

}
