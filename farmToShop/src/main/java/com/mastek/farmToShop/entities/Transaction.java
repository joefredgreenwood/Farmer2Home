package com.mastek.farmToShop.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="Transaction_DAO")
public class Transaction {
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int transactionID;	
	String transactionData;
	float transactionValue;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public String getTransactionData() {
		return transactionData;
	}
	public void setTransactionData(String transactionData) {
		this.transactionData = transactionData;
	}
	public float getTransactionValue() {
		return transactionValue;
	}
	public void setTransactionValue(float transactionValue) {
		this.transactionValue = transactionValue;
	}
	
	
//	Set<Basket> basketTransations = new HashSet<Basket>();						//SAJS ONE TO ONE BASKET AND TRANSACTION
//	
//	@OneToOne (mappedBy="basketTransactions")
//	@XmlTransient
//	public Set<Basket> getBasketTransations() {
//		return basketTransations;
//	}
//	public void setBasketTransations(Set<Basket> basketTransations) {
//		this.basketTransations = basketTransations;
//	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + transactionID;
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
		Transaction other = (Transaction) obj;
		if (transactionID != other.transactionID)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", transactionData=" + transactionData
				+ ", transactionValue=" + transactionValue + "]";
	}
	
	
	
	
	
	
	
	
	
}
