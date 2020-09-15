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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table
public class Basket {
	
	public Basket() {
		// TODO Auto-generated constructor stub
	}
	
	
	int basketID;
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
	
//	Set<Customer> customersBasket = new HashSet<Customer>();				//SAJS JOIN Customer to basket MANY TO MANY
//
//	@ManyToMany (mappedBy="customersBaskets")
//	@XmlTransient
//	public Set<Customer> getCustomersBasket() {
//		return customersBasket;
//	}
//	public void setCustomersBasket(Set<Customer> customersBasket) {
//		this.customersBasket = customersBasket;
//	}




//	Set<Transaction> basketTransactions = new HashSet<Transaction>();		//SAJS JOIN basket to transaction ONE TO ONE
//	
//	@OneToOne (cascade=CascadeType.ALL)
//	@JoinTable(name="Basket_Transactions",
//			   joinColumns= {@JoinColumn(name="fk_basketID")},
//			   inverseJoinColumns = {@JoinColumn(name="fk_transactionID")})
//
//	@XmlTransient
//	public Set<Transaction> getBasketTransactions() {
//		return basketTransactions;
//	}
//	public void setBasketTransactions(Set<Transaction> basketTransactions) {
//		this.basketTransactions = basketTransactions;
//	}






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
