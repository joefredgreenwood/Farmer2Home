package com.mastek.farmToShop.entities;


import javax.persistence.CascadeType;
import javax.persistence.Column;

import java.time.LocalDate;
import java.util.HashSet;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table
//@NamedQuery(name="Product.findByFarmID", 
//			query="select p from (((Product p join farm_produce g ((on p.productID=:g.fk_productid)) join Farm f on ((g.fk_farmid=:f.farmid)) where f.farmid=:farmID") 
public class Product {
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	
	@FormParam("productID")
	int productID;


	@FormParam("productName")
	String productName;
	
	@FormParam("productQuantity")
	int productQuantity;
	
	@FormParam("productPrice")
	double productPrice;
	
	int remainQuantity;
	
	LocalDate date;
	

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
	


	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getRemainQuantity() {
		return remainQuantity;
	}

	public void setRemainQuantity(int remainQuantity) {
		this.remainQuantity = remainQuantity;
	}
	
	
	
	
	
	/////////////////////////////////////// Joins //////////////////////////////////////////////
	



	Farm farmProduct;          //SAJS JOIN     (farm-product)   
						

	
	
	@ManyToOne
	@JoinColumn(name="fk_FarmID")
	@XmlTransient
	public Farm getFarmProduct() {
		return farmProduct;
	}

	public void setFarmProduct(Farm farmProduct) {
		this.farmProduct = farmProduct;
	}


	Set<AssignedProduct> assignedProducts = new HashSet<AssignedProduct>();							//SAJS join one to many (assigned prod-prod)

	@OneToMany (mappedBy="currentProduct", cascade=CascadeType.ALL)
	@XmlTransient
	public Set<AssignedProduct> getAssignedProducts() {
		return assignedProducts;
	}

	public void setAssignedProducts(Set<AssignedProduct> assignedProducts) {
		this.assignedProducts = assignedProducts;
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
