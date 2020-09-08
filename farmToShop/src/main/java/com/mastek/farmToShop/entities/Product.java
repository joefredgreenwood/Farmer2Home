package com.mastek.farmToShop.entities;


import javax.persistence.Column;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table
public class Product {
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	@FormParam("product_id")
	int productID;
	
	@FormParam("product_name")
	String productName;
	
	@FormParam("product_quantity")
	int productQuantity;
	
	@FormParam("product_price")
	double productPrice;
	

	
	/*	Set<Farm> farmProduct = new HashSet<Farm>();                     
	
	@ManyToMany (mappedBy="farmProduce")
	@XmlTransient
public Set<Farm> getFarmProduct() {
	return farmProduct;
}
public void setFarmProduct(Set<Farm> farmProduct) {
	this.farmProduct = farmProduct;										
}																	
*/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productID;
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
		Product other = (Product) obj;
		if (productID != other.productID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", productPrice=" + productPrice + "]";
	}
	
	
	
	

}
