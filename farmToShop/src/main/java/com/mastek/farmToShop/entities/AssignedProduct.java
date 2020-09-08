package com.mastek.farmToShop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table
public class AssignedProduct {
	
	public AssignedProduct() {
		// TODO Auto-generated constructor stub
	}

	
	int assignedProductID;
	int productQuantity;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
/*	Basket currentBasket;
	Product currentProduct;
	
	
	public Basket getCurrentBasket() {
		return currentBasket;
	}
	public void setCurrentBasket(Basket currentBasket) {
		this.currentBasket = currentBasket;
	}
	public Product getCurrentProduct() {
		return currentProduct;
	}
	public void setCurrentProduct(Product currentProduct) {
		this.currentProduct = currentProduct;
	}*/
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
		AssignedProduct other = (AssignedProduct) obj;
		if (assignedProductID != other.assignedProductID)
			return false;
		return true;
	}
	
	


	
	
}
