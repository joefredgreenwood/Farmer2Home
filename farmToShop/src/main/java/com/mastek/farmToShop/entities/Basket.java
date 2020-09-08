package com.mastek.farmToShop.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Basket {
	
	public Basket() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int basketID;
	float basketValue;
	

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
	
Set<Customer> customersBasket = new HashSet<Customer>();	
	
	public Set<Customer> getCustomersBasket() {
	return customersBasket;
}
public void setCustomersBasket(Set<Customer> customersBasket) {
	this.customersBasket = customersBasket;
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
