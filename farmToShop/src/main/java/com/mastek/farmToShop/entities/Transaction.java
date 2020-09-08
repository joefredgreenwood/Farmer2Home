package com.mastek.farmToShop.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Transaction {
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	
	int transactionID;	
	String transactionData;
	float transactionValue;
	
	
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
