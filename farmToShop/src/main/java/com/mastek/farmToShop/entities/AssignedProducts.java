package com.mastek.farmToShop.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class AssignedProducts {
	
	public AssignedProducts() {
		// TODO Auto-generated constructor stub
	}

	
	int assignedProductID;
	int productQuantity;
	
	public int getAssignedProductID() {
		return assignedProductID;
	}
	public void setAssignedProductID(int assignedProductID) {
		this.assignedProductID = assignedProductID;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	
	///////////////////////////////Foreign Keys////////////////////////////////////
	Baskets currentBasket;
	Products currentProduct;
	
	
	public Baskets getCurrentBasket() {
		return currentBasket;
	}
	public void setCurrentBasket(Baskets currentBasket) {
		this.currentBasket = currentBasket;
	}
	public Products getCurrentProduct() {
		return currentProduct;
	}
	public void setCurrentProduct(Products currentProduct) {
		this.currentProduct = currentProduct;
	}
	@Override
	public String toString() {
		return "AssignedProducts [assignedProductID=" + assignedProductID + ", productQuantity=" + productQuantity
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assignedProductID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssignedProducts other = (AssignedProducts) obj;
		if (assignedProductID != other.assignedProductID)
			return false;
		return true;
	}
	
	


	
	
}
