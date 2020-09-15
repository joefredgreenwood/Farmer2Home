package com.mastek.farmToShop.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.GeneratorType;

@XmlRootElement
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
//	Basket currentBasket;
//	Product currentProduct;
//	
//	
//	public Basket getCurrentBasket() {
//		return currentBasket;
//	}
//	public void setCurrentBasket(Basket currentBasket) {
//		this.currentBasket = currentBasket;
//	}
	
	
	
	Product currentProduct;						//SAJS JOIN One assigned prod to many Products
	
	
	@ManyToOne
	@JoinColumn(name="fk_ProductID")
//	@Transient
	@XmlTransient
	public Product getCurrentProduct() {
		return currentProduct;
	}
	public void setCurrentProduct(Product currentProduct) {
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
		AssignedProduct other = (AssignedProduct) obj;
		if (assignedProductID != other.assignedProductID)
			return false;
		return true;
	}
	
	


	
	
}
