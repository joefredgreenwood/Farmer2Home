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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlRootElement;

import javax.ws.rs.FormParam;

import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table
public class Basket {
	
	public Basket() {
		// TODO Auto-generated constructor stub
	}
	


	@FormParam("basketID")
	int basketID;
	
	@FormParam("basketValue")
	float basketValue;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getBasketID() {
		return basketID;
	}
	public void setBasketID(int basketID) {
		this.basketID = basketID;
	}
	public float getBasketValue() {
		return basketValue;
	}
	public void setBasketValue(float basketValue) {
		this.basketValue = basketValue;
	}
	
	
	
	
	
	/////////////////////////////////////////Foreign Keys/////////////////////////////////////////
	
	Customer linkedCustomer;

	@ManyToOne
	@JoinColumn(name="fk_CustomerID")
	@XmlTransient
	public Customer getLinkedCustomer() {
		return linkedCustomer;
	}
	public void setLinkedCustomer(Customer linkedCustomer) {
		this.linkedCustomer = linkedCustomer;
	}



	Transaction linkedTransactions;


	@OneToOne(mappedBy="linkedBasket")
	@XmlTransient
	public Transaction getLinkedTransactions() {
		return linkedTransactions;
	}
	public void setLinkedTransactions(Transaction linkedTransactions) {
		this.linkedTransactions = linkedTransactions;
	}



	Set<AssignedProduct> basketProducts = new HashSet<AssignedProduct>();

	@OneToMany (mappedBy="currentBasket", cascade=CascadeType.ALL)
	@XmlTransient
	public Set<AssignedProduct> getBasketProducts() {
		return basketProducts;
	}
	public void setBasketProducts(Set<AssignedProduct> basketProducts) {
		this.basketProducts = basketProducts;
	}
	
	
	
	@Override
	public String toString() {
		return "Baskets [basketID=" + basketID + ", basketValue=" + basketValue + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + basketID;
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
		Basket other = (Basket) obj;
		if (basketID != other.basketID)
			return false;
		return true;
	}
	

	
	
	
	
	
	
}
