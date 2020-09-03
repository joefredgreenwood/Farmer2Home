package com.mastek.farmToShop.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Baskets {
	
	public Baskets() {
		// TODO Auto-generated constructor stub
	}
	
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
	
Set<Customers> customersBasket = new HashSet<Customers>();	
	
	public Set<Customers> getCustomersBasket() {
	return customersBasket;
}
public void setCustomersBasket(Set<Customers> customersBasket) {
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
		Baskets other = (Baskets) obj;
		if (basketID != other.basketID)
			return false;
		return true;
	}

	
	
	
	
}
